package MiniProjects.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class JBorder {
    public static void main(String[] args) {

        // Panels

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

        // Sub Panels

        JPanel subGreyPanel = new JPanel(); 
        JPanel subPinkPanel = new JPanel(); 
        JPanel subBlackPanel = new JPanel(); 
        JPanel subMagentaPanel = new JPanel(); 
        JPanel subOrangePanel = new JPanel(); 

        // Sub panels Background Colors

        subGreyPanel.setBackground(Color.LIGHT_GRAY);
        subOrangePanel.setBackground(Color.ORANGE);
        subPinkPanel.setBackground(Color.PINK);
        subBlackPanel.setBackground(Color.BLACK);
        subMagentaPanel.setBackground(Color.MAGENTA); 

        subGreyPanel.setPreferredSize(new Dimension(50,50));
        subPinkPanel.setPreferredSize(new Dimension(50,50));
        subBlackPanel.setPreferredSize(new Dimension(50,50));
        subOrangePanel.setPreferredSize(new Dimension(50,50));
        subMagentaPanel.setPreferredSize(new Dimension(50,50));

        // Sub Panel into a center panel
        blackPanel.setLayout(new BorderLayout());
        blackPanel.add(subGreyPanel,BorderLayout.SOUTH);
        blackPanel.add(subBlackPanel,BorderLayout.NORTH);
        blackPanel.add(subPinkPanel,BorderLayout.WEST);
        blackPanel.add(subMagentaPanel,BorderLayout.EAST);
        blackPanel.add(subOrangePanel,BorderLayout.CENTER); 



        // Frames
        JFrame frame = new JFrame(); 
        frame.setTitle("Demo JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        frame.setSize(500,500); // Set Dimensions  
        frame.setVisible(true); // It will visible the frame 
        // framegetLayeredPane().setBackground(Color.white);
        frame.setLayout(new BorderLayout(10,10));
        frame.add(redPanel,BorderLayout.NORTH);
        frame.add(yellowPanel,BorderLayout.SOUTH);
        frame.add(blackPanel,BorderLayout.CENTER);
        frame.add(greenPanel,BorderLayout.EAST);
        frame.add(bluePanel,BorderLayout.WEST);
        
    }
}
