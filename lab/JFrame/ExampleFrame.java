package JFrame;

import javax.swing.*;
import java.awt.*;

public class ExampleFrame extends JFrame {
    ExampleFrame(){

//        JFileChooser dialog = new JFileChooser();
//        JFileChooser dialog = new JFileChooser("path);

//        JColorChooser dialog = new JColorChooser(Color.BLUE);

        setLayout(new FlowLayout());
        JButton button = new JButton("Button");
        button.setToolTipText("button");
        add(button);

//        add(dialog);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ExampleFrame();

    }
}
