package DragDrop;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame {
    DragPanel panel = new DragPanel();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(null);
        this.setTitle("Mini Project");
        this.add(panel);
        this.setVisible(true);
    }
}

class DragPanel extends JPanel{
    ImageIcon icon = new ImageIcon("logo.png");
    final int WEITH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point imageCorners;
    Point Prevpt;

    DragPanel(){
        imageCorners = new Point(0,0);
        MouseClickAdapter mouseClick = new MouseClickAdapter();
        MouseMovementAdapter mouseMovement = new MouseMovementAdapter();
        this.addMouseListener(mouseClick);
        this.addMouseMotionListener(mouseMovement);
    }

    private void ColorComponent(Graphics g){

    }

    private class MouseClickAdapter extends MouseAdapter{
        
    }
    private class MouseMovementAdapter extends MouseMotionAdapter{

    }

}