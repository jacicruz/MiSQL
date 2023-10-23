package GUI;

import javax.swing.*;
import java.awt.*;

public class CrearTablas extends JPanel {
    private JLabel nombreTablaLabel;
    private JTextField nombreTablaTextField;
    private JLabel cantidadColumnasLabel;
    private SpinnerNumberModel spinnerModel;
    private JSpinner cantidadColumnasSpinner;
    private JButton crearTablaButton;
    private JButton cancelarTablaButton;

    public CrearTablas() {
        GroupLayout crearTablasLayout = new GroupLayout(this);
        setLayout(crearTablasLayout);
        setBackground(new Color(204, 223, 234));
        setBackground(new Color(204, 223, 234));
        crearTablasLayout.setAutoCreateGaps(true);
        crearTablasLayout.setAutoCreateContainerGaps(true);
        JComboBox<String> basesDeDatosComboBox = new JComboBox<>(
                new String[] { "BasedeDatos1", "Base de Datos 2", "Base de Datos 3" });
        nombreTablaLabel = new JLabel("Nombre de la tabla:");
         nombreTablaTextField = new JTextField(10);
         cantidadColumnasLabel = new JLabel("Cantidad de columnas:");
         spinnerModel = new SpinnerNumberModel(1, 1, 15, 1);
         cantidadColumnasSpinner = new JSpinner(spinnerModel);
         crearTablaButton = new JButton("Crear");
        crearTablaButton.setBackground(new Color(0, 255, 0));
        crearTablaButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         cancelarTablaButton = new JButton("Cancelar");
        cancelarTablaButton.setBackground(new Color(255, 0, 0));
        cancelarTablaButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        crearTablasLayout.setHorizontalGroup(crearTablasLayout.createSequentialGroup()
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(basesDeDatosComboBox)
                        .addComponent(nombreTablaLabel)
                        .addComponent(cantidadColumnasLabel))
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nombreTablaTextField)
                        .addComponent(cantidadColumnasSpinner)
                        .addComponent(crearTablaButton)
                        .addComponent(cancelarTablaButton)));
        crearTablasLayout.setVerticalGroup(crearTablasLayout.createSequentialGroup()
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(basesDeDatosComboBox))
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreTablaLabel)
                        .addComponent(nombreTablaTextField))
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cantidadColumnasLabel)
                        .addComponent(cantidadColumnasSpinner))
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(crearTablaButton))
                .addGroup(crearTablasLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarTablaButton)));
    }

    public JButton getCrearTablaButton() {
        return crearTablaButton;
    }

    public JSpinner getCantidadColumnasSpinner() {
        return cantidadColumnasSpinner;
    }

    public JTextField getNombreTablaTextField() {
        return nombreTablaTextField;
    }
}
