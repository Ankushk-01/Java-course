package interfaces;

public class Exceptions{
    public static void main(String[] args) {
        // Runtime errors are called Exceptions

        String str = null;
        int i = 7;
        int j = 0;
        int val[] = new int[5];

        try {
            System.out.println("value : "+val[6]);
            System.out.println(str.length()); // if it raise exception it will not go to next line it just go to catch block
            int result = i/j;
            System.out.println("result : "+result);

        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (NullPointerException e) {
            System.out.println("Cannot tell the length of the null");
        }
        catch(Exception e){
            System.out.println("something wents wrong "+e.getMessage());
        }

        System.out.println("End of line of code ");
    }
}