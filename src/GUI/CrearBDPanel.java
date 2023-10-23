package GUI;

import javax.swing.*;
import java.awt.*;

public class CrearBDPanel extends JPanel {
    private JLabel nombreLabel;
    private JTextField nombreTextField;
    private JButton crearBdButton;
    private JButton cancelarBdButton;

    public CrearBDPanel() {
        setBackground(new Color(173, 216, 230));
        GroupLayout crearBdLayout = new GroupLayout(this);
        setLayout(crearBdLayout);
        crearBdLayout.setAutoCreateGaps(true);
        crearBdLayout.setAutoCreateContainerGaps(true);

        nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField(10);
        crearBdButton = new JButton("Crear");
        crearBdButton.setBackground(new Color(0, 255, 0));
        crearBdButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cancelarBdButton = new JButton("Cancelar");
        cancelarBdButton.setBackground(new Color(255, 0, 0));
        cancelarBdButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        GroupLayout layout = crearBdLayout;
        layout.setHorizontalGroup(crearBdLayout.createSequentialGroup()
                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nombreLabel))
                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nombreTextField)
                        .addComponent(crearBdButton)
                        .addComponent(cancelarBdButton)));
        layout.setVerticalGroup(crearBdLayout.createSequentialGroup()
                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreLabel)
                        .addComponent(nombreTextField))
                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(crearBdButton))
                .addGroup(crearBdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarBdButton)));

    }
public JButton getCancelarBdButton() {
    return cancelarBdButton;
}
    public JButton getCrearBdButton() {
        return crearBdButton;
    }
    public JTextField getNombreTextField() {
        return nombreTextField;
 }
 public void setNombreTextField(JTextField nombreTextField) {
     this.nombreTextField = nombreTextField;
 }
}