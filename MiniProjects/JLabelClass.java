package MiniProjects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelClass {
    public static void main(String[] args) {
        try {
            Border border = BorderFactory.createLineBorder(Color.RED,10); 
            JLabel jLabel = new JLabel(); // Set label and label is a component
            jLabel.setText("Welcome to my Channel"); // Set the text
            jLabel.setHorizontalTextPosition(JLabel.LEADING);
            ImageIcon imageIcon = new ImageIcon("udemy-logo.png"); // Create a image icon object
            jLabel.setIcon(imageIcon); // Sets the icon only works with the .png as per my knowledge
            jLabel.setIconTextGap(40); // Sets the icon and text gap
            jLabel.setHorizontalAlignment(JLabel.CENTER); // Set the y axis alignment of content of label
            jLabel.setVerticalAlignment(JLabel.CENTER); // Set the x axis alignment of content of label
            jLabel.setFont(new Font("Mv Boli", Font.BOLD, 50)); // Sets the font of the text
            jLabel.setForeground(Color.green); // color of the font
            jLabel.setBackground(Color.black); // sets the background color it works only with below method
            jLabel.setOpaque(true); // make the background of the label is visible
            jLabel.setBorder(border);
        

            JFrame jFrame = new JFrame(); // create a JFrame
            jFrame.setTitle("Welcome page");
            // jFrame.setSize(500, 500);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon icon = new ImageIcon("logo.jpg");
            jFrame.setIconImage(icon.getImage());
            jFrame.setVisible(true);
            jFrame.add(jLabel);
            jFrame.pack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
