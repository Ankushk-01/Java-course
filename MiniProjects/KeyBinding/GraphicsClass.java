package MiniProjects.KeyBinding;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BasicStroke;
import java.awt.Color;
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
        g2D.setPaint(Color.RED);
        g2D.drawLine(0, 0, 500, 500);

        square

        g2D.setPaint(Color.BLUE);
        g2D.drawRect(10, 10, 100, 100);

        g2D.setPaint(Color.pink);
        g2D.fillRect(50, 50, 100, 100);

        g2D.setPaint(Color.GRAY);
        g2D.drawOval(350, 150, 100, 100);
        g2D.setPaint(Color.green);
        g2D.fillOval(350, 50, 100, 100);

        // g2D.dispose(); to free the resources 

        g2D.setPaint(Color.RED);
        g2D.fillArc(50,100,150,150,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(50,100,150,150,180,180);

        int [] xPoints = {150,250,350};
        int [] yPoints = {350,250,350}; 
        g2D.setPaint(Color.GREEN);
        g2D.fillPolygon(xPoints,yPoints,3);

        g2D.setPaint(Color.ORANGE);
        g2D.drawString("Hello Friends ",50,50);

    }
}