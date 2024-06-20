package MiniProjects;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClicked {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
class MyFrame extends JFrame implements MouseListener{
    JLabel label;

    MyFrame(){
        label = new JLabel();
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.setBounds(0,0, 100, 100);
        label.addMouseListener(this);

        this.add(label); 
        
        this.setTitle("Mouse Listener Demo");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // System.out.println("Mouse Exited");
    }

}