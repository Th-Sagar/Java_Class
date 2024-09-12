package JFrame;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Calculator(){


        setTitle("Calculator");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy=0;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.weightx=2;
        gbc.insets =new Insets(10,10,10,10);
        add(new JTextField(20),gbc);

        JPanel number = new JPanel();
        number.setLayout(new GridLayout(3,4,5,5));
        String[] numberString ={
                "1","2","3","4","5","6","7","8","9",".","0","C"
        };

        for (String no:numberString)
            number.add(new JButton(no));

        gbc.gridx=0;
        gbc.gridy=1;
        gbc.fill= GridBagConstraints.BOTH;
        gbc.gridwidth=1;
        add(number,gbc);

        JPanel operation = new JPanel();
        operation.setLayout(new GridLayout(5,1,5,5));
        String[] operationString ={
                "+","-","*","/","+"
        };

        for(String op :operationString)
            operation.add(new JButton(op));

        gbc.gridx=1;
        gbc.gridy=1;
        gbc.fill=GridBagConstraints.BOTH;

        add(operation,gbc);








        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
