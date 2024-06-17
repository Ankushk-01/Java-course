package MiniProjects.Slider;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class JProgressBarClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JProgressBar bar;
    MyFrame() {
        // initialization
        frame = new JFrame("Progress Bar Demo"); 
        // Bar
        bar = new JProgressBar();
        bar.setValue(0);
        bar.setBounds(0,30,500,70);
        bar.setStringPainted(true); // print the progress status like _% 
        bar.setForeground(Color.GRAY);

        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(bar);
        frame.setVisible(true);
        fill();

    }
    private void fill() {
        int counter = 0;
        while(counter <=100){
            bar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            } 
            counter+=10; 
        }
        fill();
    }
} 