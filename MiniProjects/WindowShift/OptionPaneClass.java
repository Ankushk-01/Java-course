package MiniProjects.WindowShift;

import javax.swing.JOptionPane;

public class OptionPaneClass {
    public static void main(String[] args) {
        JOptionPane pane = new JOptionPane();
        JOptionPane.showMessageDialog(null, "New Message Arrived", "Notification", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "You got 7 new messages", "FYI", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Do you want to delete this message", "Alert", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Security is compromised", "DANGER", JOptionPane.ERROR_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Virus detected", "WARNING", JOptionPane.WARNING_MESSAGE);
        // int result = JOptionPane.showConfirmDialog(null, "Do you agree with the privacy policies ?", "INFO", JOptionPane.YES_NO_OPTION);
        // if (result == 0) {
        //     JOptionPane.showMessageDialog(null, "Thanks for confirmation", "Notification", JOptionPane.PLAIN_MESSAGE);
        // }else if(result == -1){
        //     JOptionPane.showMessageDialog(null, "Wrong Option", "DANGER", JOptionPane.ERROR_MESSAGE);
        // }else{
        //     JOptionPane.showMessageDialog(null, "Closing the Application", "Warning", JOptionPane.WARNING_MESSAGE); 
        // }
        String name = JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null, "Hello "+name, "Welcome", JOptionPane.PLAIN_MESSAGE);

    }
}
