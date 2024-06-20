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
        System.out.println("Mouse Clicked");
        label.setBackground(Color.BLACK);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // System.out.println("Mouse Released");
        label.setBackground(Color.GRAY);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // System.out.println("Mouse Entered");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // System.out.println("Mouse Exited");
        label.setBackground(Color.PINK);
    }

}