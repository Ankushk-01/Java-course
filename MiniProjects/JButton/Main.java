package MiniProjects.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        new MyFrame();
    }
}


class MyFrame extends JFrame implements ActionListener{
    JButton button;
    MyFrame(){
        ImageIcon icon = new ImageIcon("logo.jpg");
        button = new JButton("Click here");
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("Poo"));
        button.setBounds(200,100,150,50); 
        button.setFocusable(false);
        button.setVerticalTextPosition(JButton.BOTTOM); 
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setFont(new Font("Comic Sans",Font.BOLD,10));
        button.setForeground(Color.BLUE);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
 
        this.setTitle("Demo JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        this.setSize(500,500); // Set Dimensions  
        this.setVisible(true); // It will visible the frame 
        // this.getLayeredPane().setBackground(Color.white);
        this.setLayout(null);
        this.setIconImage(icon.getImage());
        this.add(button); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Poo");
            button.setText("Button Clicked");
            button.setEnabled(false);
        }
    }
}