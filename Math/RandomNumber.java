package Math;

import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int input =0;
            while ((input >=0) && (input <= 10)) {
                System.out.print("Guess the random number between 1 to 10 : ");
                input = sc.nextInt();
                int num = random.nextInt(10)+1; // include 10 also
                if (input == num ) {
                    System.out.println("you guess the right number :) ");
                    break;
                }else{
                    System.out.println("Random number : "+num);
                    System.out.println("Try again !!!");
                }
                
            }
        } 
    }
}
