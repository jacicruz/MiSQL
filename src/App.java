
 import javax.swing.*;
 	import GUI.Principal;
	public class App {
// 		//Declaracion de las variables
            
// // Declaración del panel para mostrar las tablas

// 	    private JPanel conectarPanel;
// 	    private final JPanel crearBdPanel;
// 	    private final JPanel crearTablasPanel;
// 	    private final JPanel inicioPanel;
// 	    private final JPanel leftPanel; 
// 	    private final JLabel label;
//             String host;
//             String puerto;
//             String usuario;
//             String contrasena;
//             String Database;
//             String nombretabla;
//             String numcolum;
//             String nombrecolumna;
//             String TipoColumna;
//             String base;
//             JTextArea displayArea = new JTextArea(20, 40);
// 	    //Clase principal del JFrame
// 	    public App() {----------------------------
// 	        // Panel para "Conectar a BD"
	       
// //-----------------------------------------------------------------------------------------------------------------------------
	    
// //-----------------------------------------------------------------------------------------------------------------------------

// //-----------------------------------------------------------------------------------------------------------------------------
// //-----------------------------------------------------------------------------------------------------------------------------
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        // Panel para "Crear una Bd"
// 	        crearBdPanel = new JPanel();
// 	        crearBdPanel.setBackground(new Color(173, 216, 230));

// 	        GroupLayout crearBdLayout = new GroupLayout(crearBdPanel);
// 	        crearBdPanel.setLayout(crearBdLayout);
// 	        crearBdLayout.setAutoCreateGaps(true);
// 	        crearBdLayout.setAutoCreateContainerGaps(true);

// 	        // Etiquetas y cuadros de texto para "Crear una Bd"
// 	        JLabel nombreLabel = new JLabel("Nombre:");
// 	        JTextField nombreTextField = new JTextField(10);
// 	        JButton crearBdButton = new JButton("Crear");
// 	        crearBdButton.setBackground(new Color(0, 255, 0));
// 	        crearBdButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
// 	        JButton cancelarBdButton = new JButton("Cancelar");
// 	        cancelarBdButton.setBackground(new Color(255, 0, 0));
// 	        cancelarBdButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        crearBdLayout.setHorizontalGroup(crearBdLayout.createSequentialGroup()
// 	                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
// 	                        .addComponent(nombreLabel)
// 	                )
// 	                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
// 	                        .addComponent(nombreTextField)
// 	                        .addComponent(crearBdButton)
// 	                        .addComponent(cancelarBdButton)
// 	                )
// 	        );
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        crearBdLayout.setVerticalGroup(crearBdLayout.createSequentialGroup()
// 	                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(nombreLabel)
// 	                        .addComponent(nombreTextField)
// 	                )
// 	                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(crearBdButton)
// 	                )
// 	                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(cancelarBdButton)
// 	                )
// 	        );
                
//                 crearBdButton.addActionListener(new ActionListener() {
// 	            @Override
// 	            public void actionPerformed(ActionEvent e) {
// 	                       crearbase(nombreTextField.getText());
// 	            }
// 	        });
// 	      //-----------------------------------------------------------------------------------------------------	        
	     
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        // Panel para "Crear tablas de bd"
// 	        crearTablasPanel = new JPanel();
// 	        crearTablasPanel.setBackground(new Color(204, 223, 234));

// 	        GroupLayout crearTablasLayout = new GroupLayout(crearTablasPanel);
// 	        crearTablasPanel.setLayout(crearTablasLayout);
// 	        crearTablasLayout.setAutoCreateGaps(true);
// 	        crearTablasLayout.setAutoCreateContainerGaps(true);
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        // ComboBox para bases de datos
// 	        JComboBox<String> basesDeDatosComboBox = new JComboBox<>(new String[]{"BasedeDatos1", "Base de Datos 2", "Base de Datos 3"});
	               
//                 JLabel nombreTablaLabel = new JLabel("Nombre de la tabla:");
// 	        JTextField nombreTablaTextField = new JTextField(10);
// 	        JLabel cantidadColumnasLabel = new JLabel("Cantidad de columnas:");
// 	        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, 15, 1);
// 	        JSpinner cantidadColumnasSpinner = new JSpinner(spinnerModel);
// 	        JButton crearTablaButton = new JButton("Crear");
// 	        crearTablaButton.setBackground(new Color(0, 255, 0));
// 	        crearTablaButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
// 	        JButton cancelarTablaButton = new JButton("Cancelar");
// 	        cancelarTablaButton.setBackground(new Color(255, 0, 0));
// 	        cancelarTablaButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        crearTablasLayout.setHorizontalGroup(crearTablasLayout.createSequentialGroup()
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
// 	                        .addComponent(basesDeDatosComboBox)
// 	                        .addComponent(nombreTablaLabel)
// 	                        .addComponent(cantidadColumnasLabel)
// 	                )
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
// 	                        .addComponent(nombreTablaTextField)
// 	                        .addComponent(cantidadColumnasSpinner)
// 	                        .addComponent(crearTablaButton)
// 	                        .addComponent(cancelarTablaButton)
// 	                )
// 	        );
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        crearTablasLayout.setVerticalGroup(crearTablasLayout.createSequentialGroup()
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(basesDeDatosComboBox)
// 	                )
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(nombreTablaLabel)
// 	                        .addComponent(nombreTablaTextField)
// 	                )
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(cantidadColumnasLabel)
// 	                        .addComponent(cantidadColumnasSpinner)
// 	                )
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(crearTablaButton)
// 	                )
// 	                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
// 	                        .addComponent(cancelarTablaButton)
// 	                )
// 	        );
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        crearTablaButton.addActionListener(new ActionListener() {
// 	            @Override
// 	            public void actionPerformed(ActionEvent e) {
//                         setBase(basesDeDatosComboBox.getSelectedItem().toString());
//                         setNombretabla(nombreTablaTextField.getText());
//                         setNumcolum(cantidadColumnasSpinner.getValue().toString());
// 	                showTableInfoDialog(nombreTablaTextField.getText(), (int) cantidadColumnasSpinner.getValue());
// 	            }
// 	        });
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        // Panel para "Inicio"
	        
// 	        inicioPanel = new JPanel();
// 	        inicioPanel.setBackground(new Color(255, 255, 255));
// 	        GroupLayout inicioLayout = new GroupLayout(inicioPanel);
// 	        inicioPanel.setLayout(inicioLayout);
// 	        inicioLayout.setAutoCreateGaps(true);
// 	        inicioLayout.setAutoCreateContainerGaps(true);

// 	        ImageIcon icono = new ImageIcon(App.class.getResource("/com/images/BunnyDB.png"));
// 	        label = new JLabel(icono);
// 	        label.setHorizontalAlignment(SwingConstants.RIGHT);  // Centrar horizontalmente
// 	        label.setVerticalAlignment(SwingConstants.CENTER);  // Centrar verticalmente
// 	        JLabel inicioTextLabel = new JLabel("¡Bienvenido a BunnyDB!");
// 	        inicioTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
// 	        inicioTextLabel.setFont(new Font("Arial", Font.BOLD, 24));
// 	        inicioTextLabel.setForeground(Color.BLACK);
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
// 	        inicioLayout.setHorizontalGroup(inicioLayout.createSequentialGroup()
// 	                .addGroup(inicioLayout.createParallelGroup(GroupLayout.Alignment.CENTER)  // Alineación centrada
// 	                        .addComponent(label)
// 	                        .addComponent(inicioTextLabel)
// 	                )
// 	        );

// 	        inicioLayout.setVerticalGroup(inicioLayout.createSequentialGroup()
// 	                .addComponent(label)
// 	                .addComponent(inicioTextLabel)
// 	        );
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        

// 	        // Agregar los paneles a mainPanel con CardLayout
// 	        mainPanel.add(inicioPanel, "Inicio");
// 	        mainPanel.add(conectarPanel, "Conectar");
// 	        mainPanel.add(crearBdPanel, "Crear");
// 	        mainPanel.add(crearTablasPanel, "Crear tablas");
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	      //-----------------------------------------------------------------------------------------------------	        
	        
// 	        leftPanel = new JPanel();
// 	        leftPanel.setPreferredSize(new Dimension(200, 0));
// 	        leftPanel.setBackground(new Color(0, 115, 181)); // 
	 
// 	        JLabel leftLabel = new JLabel("Aqui deben de aparecer las bd");
// 	        leftLabel.setForeground(Color.WHITE);
// 	        leftPanel.add(leftLabel);
                
                
	        
//                 // Utilizar un JSplitPane para dividir la ventana en dos partes
// 	        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, mainPanel);
// 	        splitPane.setDividerLocation(200); // Ancho inicial del panel izquierdo
// 	        splitPane.setDividerSize(5); // Tamaño del divisor
// 	        splitPane.setResizeWeight(0.0); // Bloquear el movimiento del divisor
//                 leftPanel.add(displayArea);
// 	        frame.add(splitPane, BorderLayout.CENTER);

// 	        frame.setVisible(true);
// 	    }
            
//             private void crearbase(String basesita){
//                 String base = basesita;
//                 Conexion con = new Conexion();
//                 con.connect(host, puerto, usuario, contrasena);
//                 con.crearbasededatos(base);
//             }
            
            
            
// private void initDatabaseConnection() {
//     try {
//         Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/", usuario, contrasena);
//         DatabaseMetaData metaData = connection.getMetaData();
//         ResultSet databases = metaData.getCatalogs();

//         JPanel databaseButtonsPanel = new JPanel();
//         databaseButtonsPanel.setLayout(new GridLayout(0, 1));

//         displayArea.append("Bases de Datos:\n");
//         while (databases.next()) {
//             String dbName = databases.getString("TABLE_CAT");
//             JButton dbButton = new JButton(dbName);
//             dbButton.addActionListener(e -> {
//                 displayArea.setText("");  // Limpiar el contenido anterior
//                 displayArea.append("Base de datos seleccionada: " + dbName + "\n");
//                 displayTablesOfDatabase(dbName);
//             });
//             databaseButtonsPanel.add(dbButton);
//         }

//         JButton backButton = createBackButton();
//         databaseButtonsPanel.add(backButton);

//         // Agrega el panel con los botones de las bases de datos al displayArea
//         displayArea.setLayout(new BorderLayout());
//         displayArea.add(new JScrollPane(databaseButtonsPanel), BorderLayout.CENTER);

//     } catch (SQLException e) {
//         e.printStackTrace();
//     }
// }

// private JButton createBackButton() {
//     JButton backButton = new JButton("Volver al listado de bases");
//     backButton.addActionListener(e -> displayDatabaseList());
//     return backButton;
// }

// private void displayTablesOfDatabase(String dbName) {
//     try {
//         Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/" + dbName, usuario, contrasena);
//         DatabaseMetaData metaData = connection.getMetaData();
//         ResultSet tables = metaData.getTables(dbName, null, "%", new String[] { "TABLE" });

//         JPanel tablesPanel = new JPanel();
//         tablesPanel.setLayout(new GridLayout(0, 1));

//         displayArea.append("Tablas en la base de datos " + dbName + ":\n");
//         while (tables.next()) {
//             String tableName = tables.getString("TABLE_NAME");
//             JLabel tableLabel = new JLabel(tableName);
//             tablesPanel.add(tableLabel);
//         }

//         // Agrega el botón "Volver al listado de bases"
//         JButton backButton = createBackButton();
//         tablesPanel.add(backButton);

//         // Limpia el displayArea y agrega el panel con los nombres de las tablas
//         displayArea.removeAll();  
//         displayArea.setLayout(new BorderLayout());
//         displayArea.add(new JScrollPane(tablesPanel), BorderLayout.CENTER);
//         displayArea.revalidate(); 

//         // Cierra la conexión

//     } catch (SQLException e) {
//         e.printStackTrace();
//     }
// }

// private void displayDatabaseList() {
//     try {
//         Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/", usuario, contrasena);
//         DatabaseMetaData metaData = connection.getMetaData();
//         ResultSet databases = metaData.getCatalogs();

//         JPanel databaseButtonsPanel = new JPanel();
//         databaseButtonsPanel.setLayout(new GridLayout(0, 1));

//         displayArea.removeAll();  // Limpia el displayArea
//         displayArea.setLayout(new BorderLayout());
//         displayArea.add(new JScrollPane(databaseButtonsPanel), BorderLayout.CENTER);

//         while (databases.next()) {
//             String dbName = databases.getString("TABLE_CAT");
//             JButton dbButton = new JButton(dbName);
//             dbButton.addActionListener(e -> {
//                 displayArea.setText("");  // Limpiar el contenido anterior
//                 displayArea.append("Base de datos seleccionada: " + dbName + "\n");
//                 displayTablesOfDatabase(dbName);
//             });
//             databaseButtonsPanel.add(dbButton);
//         }

//         // Agrega el botón "Volver al listado de bases"
//         JButton backButton = createBackButton();
//         databaseButtonsPanel.add(backButton);

//         // Cierra la conexión
       

//         // Repinta la ventana para reflejar los cambios
//         displayArea.revalidate();  

//     } catch (SQLException e) {
//         e.printStackTrace();
//     }
// }

    
// 	  //-----------------------------------------------------------------------------------------------------	        
	    
// 	  //-----------------------------------------------------------------------------------------------------	        
// 	    private JMenuItem createMenuItem(String label) {
// 	        JMenuItem item = new JMenuItem(label);
// 	        item.addActionListener(new ActionListener() {
// 	            @Override
// 	            public void actionPerformed(ActionEvent e) {
// 	                updateMainPanel(label);
// 	            }
// 	        });
// 	        return item;
// 	    }
// 	  //-----------------------------------------------------------------------------------------------------	        
// 	  //-----------------------------------------------------------------------------------------------------	        
// 	    private void updateMainPanel(String selectedOption) {
// 	        CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
// 	        cardLayout.show(mainPanel, selectedOption);
// 	    }
// 	  //-----------------------------------------------------------------------------------------------------	        
// 	    public class ColumnInfo {
//     private String columnName;
//     private String dataType;
//     private boolean isPK;
//     private boolean isFK;
//     private boolean isUK;

//     public ColumnInfo(String columnName, String dataType, boolean isPK, boolean isFK, boolean isUK) {
//         this.columnName = columnName;
//         this.dataType = dataType;
//         this.isPK = isPK;
//         this.isFK = isFK;
//         this.isUK = isUK;
//     }

//     public String getColumnName() {
//         return columnName;
//     }

//     public String getDataType() {
//         return dataType;
//     }

//     public boolean isPK() {
//         return isPK;
//     }

//     public boolean isFK() {
//         return isFK;
//     }

//     public boolean isUK() {
//         return isUK;
//     }
// }
// 	  //-----------------------------------------------------------------------------------------------------	        
// private void showTableInfoDialog(String tableName, int columnsCount) {
//     JFrame tableInfoFrame = new JFrame("Información de la tabla");
//     tableInfoFrame.setSize(500, 500);
//     tableInfoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//     JPanel tableInfoPanel = new JPanel();
//     tableInfoPanel.setLayout(new BorderLayout());

//     JLabel tableNameLabel = new JLabel("Nombre de la tabla: " + tableName);
//     JLabel columnsCountLabel = new JLabel("Cantidad de columnas: " + columnsCount);

//     JPanel dataPanel = new JPanel(new GridLayout(columnsCount, 4));
//     List<JTextField> textFieldList = new ArrayList<>();
//     List<JComboBox<String>> dataTypeComboBoxes = new ArrayList<>();
//     List<JCheckBox> pkCheckBoxes = new ArrayList<>();
//     List<JCheckBox> fkCheckBoxes = new ArrayList<>();
//     List<JCheckBox> ukCheckBoxes = new ArrayList();

//     for (int i = 0; i < columnsCount; i++) {
//         JLabel columnNameLabel = new JLabel("Columna " + (i + 1) + ":");
//         JTextField textField = new JTextField(10);
//         JComboBox<String> dataTypeComboBox = new JComboBox<>(new String[]{"string", "int", "float", "boolean", "date", "time", "varchar"});
//         JCheckBox pkCheckBox = new JCheckBox("PK");
//         JCheckBox fkCheckBox = new JCheckBox("FK");
//         JCheckBox ukCheckBox = new JCheckBox("UK");

//         dataPanel.add(columnNameLabel);
//         dataPanel.add(textField);
//         dataPanel.add(dataTypeComboBox);
//         dataPanel.add(pkCheckBox);
//         dataPanel.add(fkCheckBox);
//         dataPanel.add(ukCheckBox);

//         textFieldList.add(textField);
//         dataTypeComboBoxes.add(dataTypeComboBox);
//         pkCheckBoxes.add(pkCheckBox);
//         fkCheckBoxes.add(fkCheckBox);
//         ukCheckBoxes.add(ukCheckBox);
//     }

//     JPanel infoDisplayPanel = new JPanel();
//     infoDisplayPanel.setLayout(new BorderLayout());
//     infoDisplayPanel.add(tableNameLabel, BorderLayout.NORTH);
//     infoDisplayPanel.add(columnsCountLabel, BorderLayout.CENTER);
//     infoDisplayPanel.add(dataPanel, BorderLayout.SOUTH);

//     JScrollPane scrollPane = new JScrollPane(infoDisplayPanel);
//     tableInfoPanel.add(scrollPane, BorderLayout.CENTER);

//     JButton createButton = new JButton("Crear");
//     createButton.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//             List<ColumnInfo> columnInfoList = new ArrayList<>();

//             for (int i = 0; i < columnsCount; i++) {
//                 String columnName = textFieldList.get(i).getText();
//                 String dataType = (String) dataTypeComboBoxes.get(i).getSelectedItem();
//                 boolean isPK = pkCheckBoxes.get(i).isSelected();
//                 boolean isFK = fkCheckBoxes.get(i).isSelected();
//                 boolean isUK = ukCheckBoxes.get(i).isSelected();

//                 ColumnInfo columnInfo = new ColumnInfo(columnName, dataType, isPK, isFK, isUK);
//                 columnInfoList.add(columnInfo);
//             }

//             // Llamar al método para crear la tabla
//             createTableInDatabase(tableName, columnsCount );

//             // Cerrar el diálogo después de crear la tabla
//             tableInfoFrame.dispose();
//         }
//     });

//     tableInfoPanel.add(createButton, BorderLayout.SOUTH);

//     tableInfoFrame.add(tableInfoPanel);
//     tableInfoFrame.setVisible(true);
// }

                  
//     private void createTableInDatabase(String tableName, int numColumns) {
//     Tablas tab = new Tablas();
//     Connection connection = null;
//     try {
//         // Establecer la conexión a la base de datos (asegúrate de configurar la conexión correctamente)
//         connection = DriverManager.getConnection("jdbc:mysql://"+host+":"+puerto+"/"+base+","+usuario+"," +contrasena);
//         JOptionPane.showMessageDialog(null, usuario + contrasena + base + puerto + host);

//         // Llamar al método existente para crear la tabla
//         tab.crearTabla(connection, tableName, numColumns);

//         JOptionPane.showMessageDialog(null, "Tabla creada con éxito: " + tableName);
//     } catch (SQLException e) {
//         JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage());
//         JOptionPane.showMessageDialog(null, usuario + contrasena + base + puerto + host);
//     } finally {
//         try {
//             if (connection != null) {
//                 connection.close();
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }

// 	  //-----------------------------------------------------------------------------------------------------	 

//     public void setHost(String host) {
//         this.host = host;
//     }

//     public void setUsuario(String usuario) {
//         this.usuario = usuario;
//     }

//     public void setContrasena(String contrasena) {
//         this.contrasena = contrasena;
//     }

//     public void setPuerto(String puerto) {
//         this.puerto = puerto;
//     }

//     public String getPuerto() {
//         return puerto;
//     }

//     public String getContrasena() {
//         return contrasena;
//     }

//     public String getUsuario() {
//         return usuario;
//     }

//     public String getHost() {
//         return host;
//     }

//     public void setDatabase(String Database) {
//         this.Database = Database;
//     }

//     public String getDatabase() {
//         return Database;
//     }

//     public String getNumcolum() {
//         return numcolum;
//     }

//     public void setNumcolum(String numcolum) {
//         this.numcolum = numcolum;
//     }

//     public String getNombrecolumna() {
//         return nombrecolumna;
//     }

//     public void setNombrecolumna(String nombrecolumna) {
//         this.nombrecolumna = nombrecolumna;
//     }

//     public String getNombretabla() {
//         return nombretabla;
//     }

//     public void setNombretabla(String nombretabla) {
//         this.nombretabla = nombretabla;
//     }

//     public String getTipoColumna() {
//         return TipoColumna;
//     }

//     public void setTipoColumna(String TipoColumna) {
//         this.TipoColumna = TipoColumna;
//     }

//     public String getBase() {
//         return base;
//     }

//     public void setBase(String base) {
//         this.base = base;
//     }
    
    
    

	  //-----------------------------------------------------------------------------------------------------	        
	    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Principal principal = new Principal();
                principal.frame.setVisible(true);
            }
        });
    }
}
	//------------------------------