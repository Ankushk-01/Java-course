package MiniProjects.Slider;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}


class MyFrame implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    MyFrame() {
        // initialization
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);
        
        // slider.
        slider.setPreferredSize(new Dimension(200,350));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(JSlider.VERTICAL);
        slider.addChangeListener(this);
        
        // label
        label.setText("C : "+slider.getValue());
        // Panel

        panel.add(label); 
        panel.add(slider);
        
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(panel);
        frame.setLayout(new FlowLayout());  
        frame.setVisible(true);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C : "+slider.getValue());
    }
}