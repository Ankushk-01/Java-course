package interfaces;

import java.io.IOException;

public class InputsWays {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int num = 0;
        try {
            num = System.in.read(); // it retruns the ASCII value of each value taking from console  and also read one characher at a time 
        } catch (IOException e) {
            e.printStackTrace();
        }

        // to resolve this issue remove the value 48 from the num 

        System.out.println("the number is : "+(num-48));
        
    }
}
