package GUI;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your String ");
        String reverse = "";
        for(int i = name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        System.out.println("reverse string : "+reverse);
        JOptionPane.showMessageDialog(null,"Reversed String "+reverse);
    }
}
