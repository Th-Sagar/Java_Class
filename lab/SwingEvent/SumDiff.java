package SwingEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SumDiff extends JFrame {
    SumDiff(){
        setTitle("Sum and diff");
        setLayout(new FlowLayout());
        JTextField j1 = new JTextField(20);
        JLabel jLabel = new JLabel();

        JTextField j2 = new JTextField(20);
        add(j1);

        add(j2);

        JButton jButton = new JButton("Sum");

        JButton jButton1 = new JButton("Diff");
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(e);
                Integer num1 = Integer.valueOf(j1.getText());
                Integer num2 = Integer.valueOf(j2.getText());
//                if(e.getSource() == jButton){
//                    int sum = num1 + num2;
//                    jLabel.setText(String.valueOf(sum));
//                }else {
//                    jLabel.setText(String.valueOf(num1 - num2));
//                }



                    int sum = num1 + num2;
                    jLabel.setText(String.valueOf(sum));



            }
        });

        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer num1 = Integer.valueOf(j1.getText());
                Integer num2 = Integer.valueOf(j2.getText());

                jLabel.setText(String.valueOf(num1 - num2));

            }
        });
        add(jButton);
        add(jButton1);
        add(jLabel);

        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SumDiff();
    }
}
