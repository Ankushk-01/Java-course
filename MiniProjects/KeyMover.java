package MiniProjects;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMover {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    MyFrame(){
        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(0,0,100,100);
        label.setOpaque(true);

        this.setSize(500,500);
        this.setTitle("Key Listener demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); 
        this.add(label); 
        this.setVisible(true);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    // @Override
    // public void keyPressed(KeyEvent e) {
    //     switch (e.getKeyCode()) {
    //         case 38:
    //             label.setLocation(label.getX(), label.getY()-5);
    //             break;
    //         case 40:
    //             label.setLocation(label.getX(), label.getY()+5);
    //             break;
    //         case 37:
    //             label.setLocation(label.getX()-5, label.getY());
    //             break;
    //         case 39:
    //             label.setLocation(label.getX()+5, label.getY());
    //             break;
        
    //         default:
    //             break;
    //     }
    // }

    // @Override
    // public void keyReleased(KeyEvent e) {
    //     System.out.println("Key released : "+e.getKeyChar());
    //     System.out.println("Key released code : "+e.getKeyCode());
    // }

}