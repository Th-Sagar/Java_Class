package JFrame;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        setTitle("My title");

//        setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

//        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));


//        setLayout(new GridLayout(4,3));
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel l = new JLabel("Enter Your Name: ");
        JTextField tF = new JTextField(10);
        JTextArea tA = new JTextArea(10,20);
        JPasswordField pF = new JPasswordField(10);
        pF.setEchoChar('*');
        JCheckBox cB = new JCheckBox("Accept terms and condition");
        JCheckBox cB1 = new JCheckBox("Accept terms and condition",true);


        //For radio button we have to make button group
        JRadioButton rB1 = new JRadioButton("Male");
        JRadioButton rB2 = new JRadioButton("Female");
        JRadioButton rB3 = new JRadioButton("Others");
        ButtonGroup bG = new ButtonGroup();
        bG.add(rB1);
        bG.add(rB2);
        bG.add(rB3);

        String[] country = {"Nepal", "India", "China"};
        JComboBox<String> cBox = new JComboBox<String>(country);
        JComboBox<String> cBox1 = new JComboBox<>();

        cBox1.addItem("Female");
        cBox1.insertItemAt("Male",0);


        JSlider s = new JSlider(SwingConstants.HORIZONTAL,0,100,25);
        s.setPaintTicks(true);
        s.setPaintLabels(true);


        add(l);
        add(tF);
        add(tA);
        add(pF);
        add(cB);
        add(cB1);
        add(rB1);

        add(rB2);
        add(rB3);
        add(cBox);
        add(cBox1);
        add(s);


        setSize(500,500);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();

    }
}
