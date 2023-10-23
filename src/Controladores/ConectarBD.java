package Controladores;

import GUI.ConectarPanel;
import Modelo.Modelobd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConectarBD {
    public ConectarBD(ConectarPanel conect) {
        conect.getConectarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String host;
                String puerto;
                String usuario;
                String contraseña;
                Modelobd model = new Modelobd();
                host = conect.getDireccionTextField().getText();
                puerto = conect.getPuertoTextField().getText();
                usuario = conect.getUsuarioTextField().getText();
                contraseña = conect.getContrasenaField().getText();
                model.conectar(puerto, host, usuario, contraseña);
            }
        });

    }
}