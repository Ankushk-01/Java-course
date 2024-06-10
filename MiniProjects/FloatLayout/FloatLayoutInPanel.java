package MiniProjects.FloatLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FloatLayoutInPanel {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.setBounds(10,10,250,250);
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.setPreferredSize(new Dimension(250,250));



        JFrame frame = new JFrame(); 
        frame.setTitle("Demo JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        frame.setLayout(new FlowLayout()); // It is the layout which set the components in the row and it change when the frame shrinks 
        frame.add(panel);
    }
}
