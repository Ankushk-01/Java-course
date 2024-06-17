package MiniProjects.Slider;

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
        bar.setStringPainted(true);
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(bar);
        frame.setVisible(true);

    }
} 