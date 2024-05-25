import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            System.out.print("Enter your favorite food : ");
            sc.nextLine();
            String food = sc.nextLine();
            System.out.println("Your name is : "+name+" and age is : "+age+" also the food is : "+food);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
