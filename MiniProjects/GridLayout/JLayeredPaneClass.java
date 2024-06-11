package MiniProjects.GridLayout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPaneClass {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.black);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.RED);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2,JLayeredPane.DRAG_LAYER);
        layeredPane.add(label3,JLayeredPane.SOMEBITS);

        JFrame frame = new JFrame(); 
        frame.add(layeredPane);
        frame.setTitle("Grid Layout Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        frame.setLayout(null);
    }
}
