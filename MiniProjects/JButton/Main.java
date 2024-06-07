package MiniProjects.JButton;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}


class MyFrame extends JFrame{
    MyFrame(){
       JFrame jFrame = new JFrame();
        jFrame.setTitle("Demo JFrame");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when click on cross button
        jFrame.setSize(500,500); // Set Dimensions  
        jFrame.setVisible(true); // It will visible the frame 
    }
}