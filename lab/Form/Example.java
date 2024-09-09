package Form;

import javax.swing.*;
import java.awt.*;

class GuiExample extends JFrame {
    GuiExample() {
        setTitle("Registration Form");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        gbc.insets = new Insets(10, 10, 10, 10);

        ButtonGroup bg = new ButtonGroup();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(new JLabel("Registration Form : "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(new JLabel("First Name : "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(new JLabel("Last Name : "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(new JLabel("Gender : "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        JRadioButton jb1 = new JRadioButton("Male");
        bg.add(jb1);
        add(jb1, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        JRadioButton jb2 = new JRadioButton("Female");
        bg.add(jb2);
        add(jb2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Birth Date : "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        String[] month = {"Month", "Jan", "Feb", "March"};
        JComboBox<String> jcb1 = new JComboBox<>(month);
        add(jcb1, gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        String[] day = {"Day", "1", "2", "3"};
        JComboBox<String> jcb2 = new JComboBox<>(day);
        add(jcb2, gbc);

        gbc.gridx = 6;
        gbc.gridy = 4;
        gbc.weightx = 2;
        add(new JTextField(5), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Time zone : "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weightx = 6;
        String[] time = {
                "Select Time Zone",
                "UTC-12:00",
                "UTC-11:00",
                "UTC-10:00",
                "UTC-09:00",
                "UTC-08:00"
        };
        JComboBox<String> jcb3 = new JComboBox<>(time);
        add(jcb3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Occupation : "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weightx = 6;
        String[] occupation = {"Select One Occupation", "Student", "Teacher"};
        JComboBox<String> jcb4 = new JComboBox<>(occupation);
        add(jcb4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        add(new JCheckBox(), gbc);

        gbc.gridx = 2;
        gbc.gridy = 7;
        add(new JLabel("I own or work with small business"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        add(new JButton("Submit"), gbc);

        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Example {
    public static void main(String[] args) {
        new GuiExample();
    }
}
