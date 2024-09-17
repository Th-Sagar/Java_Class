package JFrame;

import javax.swing.*;
import java.awt.*;

public class BorderlayoutExample extends JFrame {
    BorderlayoutExample(){
        setSize(500,500);
        setTitle("BorderlayoutExample");

        setLayout(new BorderLayout());
        JButton b = new JButton("North");
        add(b,BorderLayout.EAST);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderlayoutExample();
    }
}
