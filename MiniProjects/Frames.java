package MiniProjects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Image;

public class Frames {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Demo JFrame");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        ImageIcon image = new ImageIcon("logo.jpg");
        jFrame.setIconImage(image.getImage());
        jFrame.setBackground(Color.GRAY);
        jFrame.setSize(420,420); // Set Dimensions 
        jFrame.setVisible(true); // It will visible the frame
    }
}
