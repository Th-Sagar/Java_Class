package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UserRegistration extends JFrame {
    UserRegistration(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        setTitle("User Registration");



        gbc.insets = new Insets(10,10,10,10);
        ButtonGroup bg = new ButtonGroup();
        JLabel label = new JLabel();

        gbc.gridy=0;
        gbc.gridx = 0;
        JLabel jLabel = new JLabel("Name : ");
        add(jLabel,gbc);

        gbc.gridy=0;
        gbc.gridx = 2;
        JTextField name = new JTextField(20);
        add(name,gbc);


        gbc.gridy=1;
        gbc.gridx = 0;
        JLabel jLabel1 = new JLabel("Address : ");
        add(jLabel1,gbc);

        gbc.gridy=1;
        gbc.gridx = 2;
        JTextField address = new JTextField(20);
        add(address,gbc);


        gbc.gridy=2;
        gbc.gridx = 0;
        JLabel jLabel2 = new JLabel("Gender : ");
        add(jLabel2,gbc);


        gbc.gridy=2;
        gbc.gridx = 2;


        JRadioButton maleButton = new JRadioButton("Male");
        bg.add(maleButton);
        add(maleButton,gbc);



        gbc.gridy=2;
        gbc.gridx = 3;
        JRadioButton femaleButton = new JRadioButton("Female");
        bg.add(femaleButton);
        add(femaleButton,gbc);




        gbc.gridy=2;
        gbc.gridx = 4;
        JRadioButton otherButton = new JRadioButton("Other");
        bg.add(otherButton);
        add(otherButton,gbc);


        gbc.gridy=3;
        gbc.gridx = 0;
        JLabel country1 = new JLabel("Country : ");
        add(country1,gbc);


        gbc.gridy=3;
        gbc.gridx=2;
        String[] countryName = {
                "Country",
                "Nepal",
                "India",
                "China"
        };
        JComboBox<String> country = new JComboBox<>(countryName);
        add(country,gbc);

        gbc.gridy=4;
        gbc.gridx = 0;
        JLabel jLabel4 = new JLabel("Mobile Number : ");
        add(jLabel4,gbc);

        gbc.gridy=4;
        gbc.gridx = 2;
        JTextField mobile = new JTextField(20);
        add(mobile,gbc);


        gbc.gridy=5;
        gbc.gridx = 0;
        JLabel jLabel5 = new JLabel("Hobbies : ");
        add(jLabel5,gbc);

        gbc.gridy=5;
        gbc.gridx = 2;
        JCheckBox music = new JCheckBox("Music");
        add(music,gbc);

        gbc.gridy=5;
        gbc.gridx = 3;
        JCheckBox reading = new JCheckBox("Reading");
        add(reading,gbc);


        gbc.gridx=2;
        gbc.gridy=6;
        JButton submit = new JButton("Submit");
        submit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameInput = name.getText();
                String addressInput = address.getText();
                String mobileNumber = mobile.getText();
                boolean maleButtonInput = maleButton.isSelected();
                boolean femaleButtonInput = femaleButton.isSelected();
                boolean otherButtonInput = otherButton.isSelected();



                if(!maleButtonInput && !femaleButtonInput && !otherButtonInput){
                    label.setText("Please select gender");

                }

                if(country.getSelectedIndex()==0){
                    label.setText("PLease select any country");
                }


                if(!music.isSelected() && !reading.isSelected()){
                    label.setText("Please select any hobbies");
                }




                if(nameInput.equals("") || addressInput.equals("")|| mobileNumber.equals("")){
                    label.setText("Please enter all fields name");
                }


                label.setText("");
                System.out.println(nameInput);
                System.out.println(addressInput);
                System.out.println(mobileNumber);

            }
        });
        add(submit,gbc);













        gbc.gridy=7;
        gbc.gridx=2;


        add(label,gbc);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        setVisible(true);

    }
    public static void main(String[] args) {
        new UserRegistration();
    }
}
