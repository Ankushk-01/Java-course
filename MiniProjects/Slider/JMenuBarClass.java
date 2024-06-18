package MiniProjects.Slider;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;

public class JMenuBarClass {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(); 
    }
}


class MyFrame {
    JFrame frame;
    MenuBar menuBar;
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
        MenuItem openFile = new MenuItem("Open File");
        MenuItem saveFile = new MenuItem("Save File");
        MenuItem exit = new MenuItem("Exit");

        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(exit);

        // initialization
        frame = new JFrame("Progress Bar Demo"); 
        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setMenuBar(menuBar);
        frame.setVisible(true); 

    }
} 
