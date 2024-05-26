package GUI;

import javax.swing.JOptionPane;

public class ReverseInt {
    public static void main(String[] args) {
        int input = 0;
        try {
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter the number "));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int reverse = 0;
        while (input !=0) {
            int remainder = input % 10;
            reverse = (reverse*10)+ remainder;
            input = input/10;
        }
        JOptionPane.showMessageDialog(null, "reversed input : "+reverse);
    }
}
