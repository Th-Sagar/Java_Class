package JFrame;

import javax.swing.*;
import java.awt.*;

public class PanelExample extends JFrame {
    PanelExample(){


        setTitle("Calculator");
        setLayout(new GridBagLayout());  // Set GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints(); // To specify grid positioning

        // Creating panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Adding components to panels
        p1.add(new JTextField(20));
        p2.add(new JButton("Button2"));

        // Set constraints for p1 (first row, fill horizontal space)
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 0;  // Row 0
        gbc.gridwidth = 2;  // Span two columns
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Fill horizontally
        gbc.insets = new Insets(10, 10, 10, 10);  // Set padding
        add(p1, gbc);  // Add p1 to frame

        // Set constraints for p2 (second row)
        gbc.gridx = 0;  // Column 0
        gbc.gridy = 1;  // Row 1
        gbc.gridwidth = 1;  // Span one column
        gbc.fill = GridBagConstraints.NONE;  // No filling
        add(p2, gbc);  // Add p2 to frame

        // Set constraints for p3 (third row)
        gbc.gridx = 1;  // Column 1
        gbc.gridy = 1;  // Row 1
        add(p3, gbc);  // Add p3 to frame

        // Frame settings
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PanelExample();
    }
}
