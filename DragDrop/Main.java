package DragDrop;

import javax.swing.JFrame;
import javax.swing.JPanel;

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

}