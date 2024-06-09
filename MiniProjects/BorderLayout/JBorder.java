package MiniProjects.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class JBorder {
    public static void main(String[] args) {

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel blackPanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        
        redPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.blue);
        greenPanel.setBackground(Color.GREEN);
        blackPanel.setBackground(Color.BLACK);
        yellowPanel.setBackground(Color.YELLOW);

        redPanel.setPreferredSize(new Dimension(100,100)); 
        bluePanel.setPreferredSize(new Dimension(100,100)); 
        blackPanel.setPreferredSize(new Dimension(100,100)); 
        yellowPanel.setPreferredSize(new Dimension(100,100)); 
        greenPanel.setPreferredSize(new Dimension(100,100)); 

        JFrame frame = new JFrame(); 
        frame.setTitle("Demo JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        // framegetLayeredPane().setBackground(Color.white);
        frame.setLayout(new BorderLayout());
        frame.add(redPanel,BorderLayout.NORTH);
        frame.add(yellowPanel,BorderLayout.SOUTH);
        frame.add(blackPanel,BorderLayout.CENTER);
        frame.add(greenPanel,BorderLayout.EAST);
        frame.add(bluePanel,BorderLayout.WEST);
    }
}
