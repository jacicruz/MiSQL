package Controladores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import GUI.CrearBDPanel;
public class CrearBDControlador {
    public CrearBDControlador(CrearBDPanel vista){
        vista.getCrearBdButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = vista.getNombreTextField().getText();
                if (!nombre.isEmpty()) {
                    
                    JOptionPane.showMessageDialog(vista, "¡Base de datos '" + nombre + "' creada!");
                    vista.getNombreTextField().setText("");
                } else {
                    JOptionPane.showMessageDialog(vista, "Por favor, ingresa un nombre válido para la base de datos.");
                }
            }
        });
vista.getCancelarBdButton().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            String Jaciel = "";
            vista.getNombreTextField().setText(Jaciel);
        }
    });
}
}
