package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import GUI.CrearTablas;
import Modelo.Modelobd;

public class CrearTablasControlador {
    public CrearTablasControlador(CrearTablas si){
        si.getCrearTablaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = si.getNombreTablaTextField().getText();
                int num = Integer.parseInt(si.getCantidadColumnasSpinner().getValue().toString());
                if (!nombre.isEmpty()) {
                    Modelobd d = new Modelobd();
                    d.crearTabla(nombre, num);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un nombre válido para la base de datos.");
                }
            }
        });
    }
}
