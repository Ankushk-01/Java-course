package MiniProjects.Slider;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuBarClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(); 
    }
}


class MyFrame implements ActionListener{
    JFrame frame;
    MenuBar menuBar;
    MenuItem openFile;
    MenuItem saveFile;
    MenuItem exit;
    MyFrame() {
        // menu bar
        menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu viewMenu = new Menu("View");
        Menu helpMenu = new Menu("Help");
        // Menu bar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        // Menu Items
        openFile = new MenuItem("Open File");
        saveFile = new MenuItem("Save File");
        exit = new MenuItem("Exit");

        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(exit);

        // add action listener
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exit.addActionListener(this);
        // initialization
        frame = new JFrame("Progress Bar Demo"); 
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setMenuBar(menuBar);
        frame.setVisible(true); 

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.out.println("Exiting system");
            System.exit(0);
        }
    }
} 
