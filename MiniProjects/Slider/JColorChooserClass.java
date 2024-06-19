package MiniProjects.Slider;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JColorChooserClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton button;
    MyFrame() {

        // button 
        button = new JButton("Click me");
        button.setFocusable(false);
        button.setBounds(10,250,100,50);
        button.setVisible(true);
        button.addActionListener(this);

        // label
        label = new JLabel();
        label.setText("I can change color :)");
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli",Font.BOLD,50));
        // label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBounds(10,50,400,250);
        // initialization
        frame = new JFrame("Progress Bar Demo"); 
    
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("button clicked");
            Color color = JColorChooser.showDialog(null, "Color Picker", Color.BLACK);
            label.setForeground(color);
        }
    }

} 
