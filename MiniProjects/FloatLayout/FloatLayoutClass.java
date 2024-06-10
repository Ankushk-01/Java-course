package MiniProjects.FloatLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FloatLayoutClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setTitle("Demo JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        frame.setLayout(new FlowLayout()); // It is the layout which set the components in the row and it change when the frame shrinks 

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        
    }
}
