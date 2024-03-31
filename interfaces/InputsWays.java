package interfaces;

import java.io.IOException;

public class InputsWays {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int num = 0;
        try {
            num = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("the number is : "+num);
        
    }
}
