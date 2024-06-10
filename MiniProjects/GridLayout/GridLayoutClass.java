package MiniProjects.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout; 
import java.awt.FlowLayout;

public class GridLayoutClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setTitle("Grid Layout Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        // frame.setLayout(new FlowLayout()); 
        frame.setLayout(new GridLayout(3,3,5,5)); // It is the layout which set the components in the grid and the constructor values are grid values no. of rows and colum and the space between the cells.

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        // frame.add(new JButton("10"));
        
    }
}
