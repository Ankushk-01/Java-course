import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            int num2 = sc.nextInt();
            int result = num1/num2;
            System.out.println("Division of two numbers are: "+result);
        }catch(ArithmeticException e){
            System.out.println("Can't divide the number by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter the integer values");
        }
         catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
