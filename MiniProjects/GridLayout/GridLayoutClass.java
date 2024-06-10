package MiniProjects.GridLayout;

import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayoutClass {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); 
        frame.setTitle("Grid Layout Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        frame.setLayout(new GridLayout()); // It is the layout which set the components in the row and it change when the frame shrinks 
        
    }
}
