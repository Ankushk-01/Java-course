public class Printf {
    public static void main(String[] args) {
        /* printf method :- this method is ued to format,display and control the text which 
         can be display on the console 
         it took the two values :
         1. text which we want to format
         2. (object,variable or value)

        % [flags] [precision] [conversion character]

        */

        System.out.printf("This is the sentence %d",123);
        // [conversion character]
        int num = 10;
        boolean bool = true;
        char c = 'c';
        String name = "Ankush";
        double pie = 3.1478d;
        System.out.printf("the boolean value is :  %b",bool);
        System.out.printf("the char value is :  %c",c);
        System.out.printf("the int value is :  %d",num);
        System.out.printf("the String value is :  %s",name);
        System.out.printf("the float value is :  %f",pie);
        System.out.println();
        System.out.printf("hello %10s",name);
        // %10s makes the minimum string length to 10 and it will add whitespace if the string is short 

    }
}
