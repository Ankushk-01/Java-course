package MiniProjects;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelClass {
    public static void main(String[] args) {

        JPanel redPanel = new JPanel();
        redPanel.setBounds(0,0,250,250); 
        redPanel.setBackground(Color.red);

        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(250,0,250,250); 
        bluePanel.setBackground(Color.blue);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(0,250,500,250); 
        greenPanel.setBackground(Color.green);

        JFrame jFrame = new JFrame(); // create a JFrame
        jFrame.setTitle("Welcome page");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.add(redPanel);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);
    }
}
