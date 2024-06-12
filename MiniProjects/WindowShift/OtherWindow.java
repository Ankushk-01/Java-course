package MiniProjects.WindowShift;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OtherWindow {
    JFrame frame = new JFrame();
    OtherWindow(){
        // label
        JLabel label = new JLabel();
        label.setText("New Window");
        label.setFont(new Font("Italic", Font.BOLD, 25));
        label.setBounds(10, 10, 200, 100);
        label.setBackground(Color.gray);
        // frame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(label);
        frame.setTitle("New Window");
        frame.setVisible(true);
        
    }
}
