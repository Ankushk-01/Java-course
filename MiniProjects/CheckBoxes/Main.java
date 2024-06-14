package MiniProjects.CheckBoxes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(); 
    }
}



class MyFrame implements ActionListener{
    JFrame frame = new JFrame();
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();
    MyFrame(){
        button.setBounds(100, 150, 100, 40);
        button.setText("Click me");
        button.setFocusable(false);
        button.addActionListener(this);
        //checkbox
        checkBox.setText("I'm not a robot");
        checkBox.setBounds(100,100,150,50);
        checkBox.setFocusable(false);
        //frame
        frame.setSize(500,500);
        frame.setTitle("Check Box Frame");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(checkBox);
        frame.add(button);
        frame.setVisible(true);  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}