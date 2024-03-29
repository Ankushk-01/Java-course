package interfaces;

public class Exceptions{
    public static void main(String[] args) {
        // Runtime errors are called Exceptions

        String str = null;
        int i = 7;
        int j = 0;

        try {
            System.out.println(str.length()); // if it raise exception it will not go to next line it just go to catch block
            int result = i/j;
            System.out.println("result : "+result);

        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (NullPointerException e) {
            System.out.println("Cannot tell the length of the null");
        }

        System.out.println("End of line of code ");
    }
}