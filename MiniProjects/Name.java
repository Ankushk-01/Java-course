package MiniProjects;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = "";
            while (isBlank(name)) {
                System.out.print("Enter the name : ");
                name = sc.nextLine();
            }
            System.out.println("Hello "+name);
        }
        
    }
    public static boolean isBlank(String input){ // this method is introduced in java 11 
        if(input.trim().length() ==0) return true;
        return false;
    }
}
