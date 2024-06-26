package MiniProjects.KeyBinding;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GraphicsClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(500,500);
        this.setTitle("Graphics Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true); 
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawLine(0, 0, 500, 500);
    }
}
