package MiniProjects.JComboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener{
    JComboBox comboBox;
    MyFrame(){
        String animals [] = {"Dog","Cat","Racoon","Elephant"};
        comboBox = new JComboBox(animals); 
        comboBox.addActionListener(this);

        comboBox.addItem("Pig");
        comboBox.setEditable(true);
        comboBox.setSelectedIndex(2);
        this.add(comboBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println("selected item : "+comboBox.getSelectedItem());
            System.out.println("selected index : "+comboBox.getSelectedIndex());
        }
    }
}
