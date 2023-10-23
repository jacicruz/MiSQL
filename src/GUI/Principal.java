package GUI;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import com.mysql.cj.jdbc.DatabaseMetaData;

import Controladores.ConectarBD;
import Controladores.CrearBDControlador;
import Modelo.Modelobd;

public class Principal {
    public JFrame frame;
    private final JPanel leftPanel; 
    private JMenuBar menuBar;
    private JMenu menu;
    private JPanel mainPanel;
    private InicioPanel inicioPanel;
    private ConectarPanel conectarPanel;
    private CrearBDPanel crearBdPanel;
    private CrearTablas crearTablasPanel;
    Modelobd bd = new Modelobd();
    JTextArea displayArea = new JTextArea(20, 40);

    public Principal() {
        // -----------------------------------------------------------------------------------------------------
        // Se crea la ventana principal del programa
        frame = new JFrame("BunnyDB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(new Color(0, 162, 255)); // establece el color de fondo del contenedor
                                                                      // principal del JFrame en un tono de azul claro.
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(Principal.class.getResource("/com/images/icono.jfif")); // Cambia la ruta a la
                                                                                               // ubicación de tu icono
        Image image = icon.getImage();
        frame.setIconImage(image);

        // Se crea el menu del JFrame
        menuBar = new JMenuBar();
        menu = new JMenu("Conexion");
        menuBar.add(menu);
        // -----------------------------------------------------------------------------------------------------

        // -----------------------------------------------------------------------------------------------------
        // Se crean los items del menu
        menu.add(createMenuItem("Inicio")); // esta línea de código agrega un elemento de menú con el texto "Inicio" al
                                            // menú principal en la barra de menús (menuBar) del JFrame.
        menu.add(createMenuItem("Conectar"));
        menu.add(createMenuItem("Crear"));
        menu.add(createMenuItem("Crear tablas"));
        frame.setJMenuBar(menuBar);
        mainPanel = new JPanel(new CardLayout()); // CardLayout es un tipo de administrador de diseño que permite
                                                  // mostrar un componente a la vez, ocupando todo el espacio del
                                                  // contenedor.
        mainPanel.setBackground(Color.WHITE);

        // Agregar los paneles a mainPanel con CardLayout
        inicioPanel = new InicioPanel();
        conectarPanel = new ConectarPanel();
        crearBdPanel = new CrearBDPanel();
        crearTablasPanel = new CrearTablas();

        // Agrega los paneles al mainPanel
        mainPanel.add(inicioPanel, "Inicio");
        mainPanel.add(conectarPanel, "Conectar");
        mainPanel.add(crearBdPanel, "Crear");
        mainPanel.add(crearTablasPanel, "Crear tablas");
        // -----------------------------------------------------------------------------------------------------

        // -----------------------------------------------------------------------------------------------------

        leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 0));
        leftPanel.setBackground(new Color(0, 115, 181)); //

        JLabel leftLabel = new JLabel("Aqui deben de aparecer las bd");
        leftLabel.setForeground(Color.WHITE);
        leftPanel.add(leftLabel);

        // Utilizar un JSplitPane para dividir la ventana en dos partes
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, mainPanel);
        splitPane.setDividerLocation(200); // Ancho inicial del panel izquierdo
        splitPane.setDividerSize(5); // Tamaño del divisor
        splitPane.setResizeWeight(0.0); // Bloquear el movimiento del divisor
        leftPanel.add(displayArea);
        frame.add(splitPane, BorderLayout.CENTER);

        frame.setVisible(true);

        // Agregar los paneles a mainPanel con CardLayout
        mainPanel.add(inicioPanel, "Inicio");
        mainPanel.add(conectarPanel, "Conectar");
        mainPanel.add(crearBdPanel, "Crear");
        mainPanel.add(crearTablasPanel, "Crear tablas");

        updateMainPanel("Inicio");

        // Crear la instancia del controlador y pasar la vista
        CrearBDControlador controlador = new CrearBDControlador(crearBdPanel);
        controlador.getClass();
        ConectarBD pan = new ConectarBD(conectarPanel);
        pan.getClass();
    }

    private JMenuItem createMenuItem(String label) {
        JMenuItem item = new JMenuItem(label);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMainPanel(label);
            }
        });
        return item;
    }

    private void updateMainPanel(String selectedOption) {
    CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
    cardLayout.show(mainPanel, selectedOption);
    }
        private void displayDatabaseList() {
                try {
                    ConectarBD bd = new ConectarBD(conectarPanel);
                    Connection connection = bd.
                    java.sql.DatabaseMetaData metaData = connection.getMetaData();
                    ResultSet databases = metaData.getCatalogs();
            
                    JPanel databaseButtonsPanel = new JPanel();
                    databaseButtonsPanel.setLayout(new GridLayout(0, 1));
            
                    displayArea.removeAll();  // Limpia el displayArea
                    displayArea.setLayout(new BorderLayout());
                    displayArea.add(new JScrollPane(databaseButtonsPanel), BorderLayout.CENTER);
            
                    while (databases.next()) {
                        String dbName = databases.getString("TABLE_CAT");
                        JButton dbButton = new JButton(dbName);
                        dbButton.addActionListener(e -> {
                            displayArea.setText("");  // Limpiar el contenido anterior
                            displayArea.append("Base de datos seleccionada: " + dbName + "\n");
                            displayTablesOfDatabase(dbName);
                        });
                        databaseButtonsPanel.add(dbButton);
                    }
            
                    // Agrega el botón "Volver al listado de bases"
                    JButton backButton = createBackButton();
                    databaseButtonsPanel.add(backButton);
            
                    // Cierra la conexión
                   
            
                    // Repinta la ventana para reflejar los cambios
                    displayArea.revalidate();  
            
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            private void displayTablesOfDatabase(String dbName) {
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/" + dbName, usuario, contrasena);
        java.sql.DatabaseMetaData metaData = connection.getMetaData();
        ResultSet tables = metaData.getTables(dbName, null, "%", new String[] { "TABLE" });

        JPanel tablesPanel = new JPanel();
        tablesPanel.setLayout(new GridLayout(0, 1));

        displayArea.append("Tablas en la base de datos " + dbName + ":\n");
        while (tables.next()) {
            String tableName = tables.getString("TABLE_NAME");
            JLabel tableLabel = new JLabel(tableName);
            tablesPanel.add(tableLabel);
        }
        // Agrega el botón "Volver al listado de bases"
        JButton backButton = createBackButton();
        tablesPanel.add(backButton);

        // Limpia el displayArea y agrega el panel con los nombres de las tablas
        displayArea.removeAll();  
        displayArea.setLayout(new BorderLayout());
        displayArea.add(new JScrollPane(tablesPanel), BorderLayout.CENTER);
        displayArea.revalidate(); 

        // Cierra la conexión

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
 private JButton createBackButton() {
                JButton backButton = new JButton("Volver al listado de bases");
                backButton.addActionListener(e -> displayDatabaseList());
                return backButton;
            }
}
