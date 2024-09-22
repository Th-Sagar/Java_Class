package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistration extends JFrame implements ActionListener {
    private JTextField nameField, mobileField;
    private JTextArea addressField, outputArea;
    private JRadioButton maleRadio, femaleRadio;
    private JComboBox<String> countryBox;
    private JCheckBox hobbyReading, hobbyTraveling, hobbyCoding;
    private JButton submitButton;

    public UserRegistration() {
        setTitle("User Registration Form");
        setSize(500, 600);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding around components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name Label and Field
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(15);
        add(nameField, gbc);

        // Address Label and TextArea
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Address:"), gbc);
        gbc.gridx = 1;
        addressField = new JTextArea(3, 15);
        add(new JScrollPane(addressField), gbc);

        // Gender Label and Radio Buttons
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel();
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        add(genderPanel, gbc);

        // Country Label and ComboBox
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Country:"), gbc);
        gbc.gridx = 1;
        String[] countries = {"Select Country", "Nepal", "India", "USA", "UK"};
        countryBox = new JComboBox<>(countries);
        add(countryBox, gbc);

        // Mobile Number Label and Field
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Mobile Number:"), gbc);
        gbc.gridx = 1;
        mobileField = new JTextField(15);
        add(mobileField, gbc);

        // Hobbies Label and Checkboxes
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Hobbies:"), gbc);
        gbc.gridx = 1;
        JPanel hobbyPanel = new JPanel();
        hobbyReading = new JCheckBox("Reading");
        hobbyTraveling = new JCheckBox("Traveling");
        hobbyCoding = new JCheckBox("Coding");
        hobbyPanel.add(hobbyReading);
        hobbyPanel.add(hobbyTraveling);
        hobbyPanel.add(hobbyCoding);
        add(hobbyPanel, gbc);

        // Submit Button
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton, gbc);

        // Output TextArea (hidden initially)
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        outputArea.setVisible(false);
        add(new JScrollPane(outputArea), gbc);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText().trim();
            String mobile = mobileField.getText().trim();

            if (name.isEmpty() || mobile.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name and Mobile Number are required fields!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                StringBuilder output = new StringBuilder();
                output.append("Name: ").append(name).append("\n");
                output.append("Address: ").append(addressField.getText().trim()).append("\n");

                if (maleRadio.isSelected()) {
                    output.append("Gender: Male\n");
                } else if (femaleRadio.isSelected()) {
                    output.append("Gender: Female\n");
                } else {
                    output.append("Gender: Not Specified\n");
                }

                output.append("Country: ").append(countryBox.getSelectedItem().toString()).append("\n");
                output.append("Mobile Number: ").append(mobile).append("\n");

                output.append("Hobbies: ");
                if (hobbyReading.isSelected()) output.append("Reading ");
                if (hobbyTraveling.isSelected()) output.append("Traveling ");
                if (hobbyCoding.isSelected()) output.append("Coding ");
                output.append("\n");

                outputArea.setText(output.toString());
                outputArea.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new UserRegistration();
    }
}
