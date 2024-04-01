package interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputsWays {
    public static void main(String[] args) {
        // System.out.print("Enter the number : ");
        // int num = 0;
        // try {
        //     num = System.in.read(); // it retruns the ASCII value of each value taking from console  and also read one characher at a time 
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // // to resolve this issue remove the value 48 from the num 
        // System.out.println("the number is : "+(num-48));


        // Another way

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num1 = 0;
        // try {
        //     num1 = Integer.parseInt(bf.readLine());
        // } catch (NumberFormatException | IOException e) {
        //     e.printStackTrace();
        // }
        // finally{
        //     try {
        //         bf.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }
        // System.out.println("Number is : "+num1);


        // 3 way 
        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.print("Enter the first number : ");
        //     int num3 = sc.nextInt();
        //     System.out.print("Enter the 2nd number : ");
        //     int num4 = sc.nextInt();
        //     System.out.println("Division : "+(num3/num4));

        // }catch(ArithmeticException e){
        //     // e.printStackTrace();
        //     System.out.println("error : "+e.getMessage());
        // }

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name : ");
            String name = bf.readLine();
            System.out.println("Ohh let me guess your name is "+name+" right !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
