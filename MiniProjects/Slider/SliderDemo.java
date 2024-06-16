package MiniProjects.Slider;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}


class MyFrame {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    MyFrame() {
        // initialization
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);
        
        // slider.
        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        // Panel

        panel.add(slider);
        panel.add(label); 
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(panel);
        frame.setLayout(new FlowLayout()); 
        frame.setVisible(true);

    }
}