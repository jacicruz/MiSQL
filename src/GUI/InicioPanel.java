package GUI;

import javax.swing.*;
import java.awt.*;

public class InicioPanel extends JPanel {
    private final JPanel inicioPanel;
    private JLabel label;
    private JLabel inicioTextLabel;
    public InicioPanel() {
        inicioPanel = new JPanel();
        setBackground(new Color(255, 255, 255));
        GroupLayout inicioLayout = new GroupLayout(inicioPanel);
        setLayout(new GroupLayout(this));
        inicioLayout.setAutoCreateGaps(true);
        inicioLayout.setAutoCreateContainerGaps(true);
        inicioTextLabel = new JLabel("¡Bienvenido a BunnyDB!");
        ImageIcon icono = new ImageIcon(getClass().getResource("/com/images/BunnyDB.png"));
        label = new JLabel(icono);
        label.setHorizontalAlignment(SwingConstants.RIGHT); // Centrar horizontalmente
        label.setVerticalAlignment(SwingConstants.CENTER); // Centrar verticalmente
        inicioTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
        inicioTextLabel.setFont(new Font("Arial", Font.BOLD, 24));
        inicioTextLabel.setForeground(Color.BLACK);

        GroupLayout layout = (GroupLayout) getLayout();
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(label)
                        .addComponent(inicioTextLabel)));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addComponent(inicioTextLabel));
    }
    }