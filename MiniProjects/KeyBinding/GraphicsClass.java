package MiniProjects.KeyBinding;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GraphicsClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame {
    MyLabel label;
    MyFrame(){
        label = new MyLabel();
        this.add(label);
        this.setTitle("Graphics Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true); 
    }
}

class MyLabel extends JLabel{
    MyLabel(){
        this.setPreferredSize(new Dimension(500, 500));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0, 0, 500, 500);
    }
}