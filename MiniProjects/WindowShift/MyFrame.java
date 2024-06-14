package MiniProjects.WindowShift;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
public class MyFrame implements ActionListener{
    JFrame frame = new JFrame();
    MyFrame() {
        // button
        JButton button = new JButton("Click me");
        button.setBounds(200, 200, 100, 50);
        button.addActionListener(this);
        button.setFocusable(true);

        // frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
        OtherWindow window = new OtherWindow();
        // frame.dispose();
    }
}
