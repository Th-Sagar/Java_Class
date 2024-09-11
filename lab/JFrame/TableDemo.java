package JFrame;

import javax.swing.*;
import java.awt.*;

public class TableDemo extends JFrame {
    TableDemo(){

        String[][] data ={{"1","Ram","CSIT"},{"2","Sita","BCA"},{"3","Ravan","BBM"}};
        String[] header ={"SN","Name","Course"};
        JTable table = new JTable(data,header);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TableDemo();
    }
}
