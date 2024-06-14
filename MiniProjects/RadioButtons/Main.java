package MiniProjects.RadioButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener{
    JRadioButton pizza = new JRadioButton("pizza");
    JRadioButton burger = new JRadioButton("burger");
    JRadioButton momos = new JRadioButton("momos");
    JLabel label = new JLabel();

    MyFrame(){
        label.setBounds(150,150,150,100);
        pizza.setBounds(100, 100, 100, 50);
        burger.setBounds(200, 100, 100, 50);
        momos.setBounds(300, 100, 100, 50);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizza);
        buttonGroup.add(burger);
        buttonGroup.add(momos);

        pizza.addActionListener(this); 
        burger.addActionListener(this); 
        momos.addActionListener(this); 

        this.setSize(500, 500);
        this.setTitle("Radio Button Demo");
        this.setLayout(null);
        this.add(pizza);
        this.add(burger);
        this.add(momos);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
   
    } 
      

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizza) {
            label.setText("Pizza order is confirmed");
        }
        else if (e.getSource()==burger) {
            label.setText("Burger order is confirmed");
        }
        else{
            label.setText("Momos order is confirmed");
        } 
    }
}
