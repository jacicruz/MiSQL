package GUI;

import javax.swing.*;
import java.awt.*;

public class ConectarPanel extends JPanel {
    private JLabel puertoLabel;
    private JTextField puertoTextField;
    private JLabel direccionLabel;
    private JTextField direccionTextField;
    private JLabel usuarioLabel;
    private JTextField usuarioTextField;
    private JLabel contrasenaLabel;
    private JTextField contrasenaField;
    private JButton testButton;
    private JButton conectarButton;

    public ConectarPanel() {
        setBackground(new Color(204, 223, 234));
        GroupLayout conectarLayout = new GroupLayout(this);
        setLayout(conectarLayout);
        conectarLayout.setAutoCreateGaps(true); 
        conectarLayout.setAutoCreateContainerGaps(true);          
        
        puertoLabel = new JLabel("Puerto:");
        puertoTextField = new JTextField(10); //Campo de texto 
        direccionLabel = new JLabel("Host:");//Label para el host
        direccionTextField = new JTextField(10);//campo de texto
        usuarioLabel = new JLabel("Usuario:");//Label para usuario
        usuarioTextField = new JTextField(10);//campo de Texto
        contrasenaLabel = new JLabel("Contraseña:"); //label de la contraseña
        contrasenaField = new JPasswordField(10); //area de la contraseña
        testButton = new JButton("Prueba"); //boton para prubeas
        testButton.setBackground(new Color(114, 253, 253)); //Color del boton
        testButton.setBorder(BorderFactory.createLineBorder(Color.WHITE)); //color de los bordes
        conectarButton = new JButton("Conectar"); //boton para conectar
        conectarButton.setBackground(new Color(83, 161, 255)); //Color del boton?
        conectarButton.setForeground(Color.white); //Color de letras del botol
        conectarButton.setBorder(BorderFactory.createLineBorder(Color.white)); //bordes del boton
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        GroupLayout layout = conectarLayout;
        layout.setHorizontalGroup(conectarLayout.createSequentialGroup()
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                        .addComponent(puertoLabel)
	                        .addComponent(direccionLabel)
	                        .addComponent(usuarioLabel)
	                        .addComponent(contrasenaLabel)
	                        .addComponent(testButton)
	                ) //El primer grupo (SequentialGroup) incluye los labels y el botón de prueba (puertoLabel, direccionLabel, usuarioLabel, contrasenaLabel, testButton).
	                
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                        .addComponent(puertoTextField)
	                        .addComponent(direccionTextField)
	                        .addComponent(usuarioTextField)
	                        .addComponent(contrasenaField)
	                        .addComponent(conectarButton)
     )); //El segundo grupo (SequentialGroup) incluye los campos de texto y el botón de conectar (puertoTextField, direccionTextField, usuarioTextField, contrasenaField, conectarButton)
                    
                    layout.setVerticalGroup(conectarLayout.createSequentialGroup()
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                        .addComponent(puertoLabel)
	                        .addComponent(puertoTextField)
	                ) // En este caso, los componentes se agrupan en parejas relacionadas, y luego esas parejas se agrupan en una secuencia.
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                        .addComponent(direccionLabel)
	                        .addComponent(direccionTextField)
	                )// cada etiqueta, con su cuadro de texto
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                        .addComponent(usuarioLabel)
	                        .addComponent(usuarioTextField)
	                )//En todos los casos
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                        .addComponent(contrasenaLabel)
	                        .addComponent(contrasenaField)
	                )//Como vemos aqui
	                .addGroup(conectarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                        .addComponent(testButton)
	                        .addComponent(conectarButton)
	                )//y aqui
    );
}
public JButton getConectarButton() {
    return conectarButton;
}
public JTextField getPuertoTextField() {
    return puertoTextField;
}
public JTextField getDireccionTextField() {
    return direccionTextField;
}
public JTextField getUsuarioTextField() {
    return usuarioTextField;
}
public JTextField getContrasenaField() {
    return contrasenaField;
}
}
