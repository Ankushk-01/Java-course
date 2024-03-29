package interfaces;

public class CustomExceptions {
    public static void main(String[] args) {
        int i = 12;
        int j = 10;
        try {
             // if it raise exception it will not go to next line it just go to catch block
            int result = i/j;
            System.out.println("result : "+result);
            throw new AnkushException("bhai cant divide by zero");

        } 
        catch (AnkushException e){
            System.out.println("AnkushException Arrised : "+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}


class AnkushException extends Exception{
    public AnkushException(String message){
        super(message);
    }
}