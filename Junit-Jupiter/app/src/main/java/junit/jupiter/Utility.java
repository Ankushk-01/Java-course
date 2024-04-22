package junit.jupiter;
import java.util.Arrays;
public class Utility {
    public String reverseString(String string){
        String reversedString = "";
        for(int i = string.length() -1; i>=0; i--){
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    public int reverseInteger(int integer){
        int reversedInt = 0;
        while (integer >0) {
            int lastDigit = integer%10;
            reversedInt = (reversedInt*10)+lastDigit;
            integer = integer/10;
        }
        return reversedInt;
    }

    public Boolean reversBoolean(Boolean input){
        return !input;
    }

    public int [] sortArray(int [] input){
        Arrays.sort(input);
        return input; 
    }
}
