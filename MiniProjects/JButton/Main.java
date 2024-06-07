package MiniProjects.JButton;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        new MyFrame();
    }
}


class MyFrame extends JFrame{
    JButton button;
    MyFrame(){
        button = new JButton("Click here to poo");
        button.addActionListener(e -> System.out.println("Poo"));
        button.setBounds(100,100,200,100); 
        button.setForeground(Color.blue);
        this.setTitle("Demo JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        this.setSize(500,500); // Set Dimensions  
        this.setVisible(true); // It will visible the frame 
        this.getLayeredPane().setBackground(Color.white);
        this.add(button);
    }
}