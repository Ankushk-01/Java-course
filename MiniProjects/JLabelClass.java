package MiniProjects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelClass {
    public static void main(String[] args) {
        JLabel jLabel = new JLabel(); // Set label and label is a component
        jLabel.setText("Welcome to my Channel");
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.TOP); 
        ImageIcon imageIcon = new ImageIcon("logo.jpg");
        jLabel;
        
        JFrame jFrame = new JFrame(); // create a JFrame
        jFrame.setTitle("Welcome page");
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true); 
        jFrame.add(jLabel);
    }
}
