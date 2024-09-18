package SwingEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwapNumber extends JFrame  {
    SwapNumber(){
        setLayout(new FlowLayout());
        setTitle("Swap and clear number");
        JButton jButton = new JButton("Click here ");
        JTextField jTextField = new JTextField(20);
        JTextField jTextField1 = new JTextField(20);

        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Integer num1 = Integer.valueOf(jTextField.getText());
                Integer num2 = Integer.valueOf(jTextField1.getText());
                jTextField.setText(String.valueOf(num2));
                jTextField1.setText(String.valueOf(num1));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jTextField.setText("");
                jTextField1.setText("");
            }
        });
        add(jTextField);
        add(jTextField1);
        add(jButton);

        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwapNumber();
    }
}
