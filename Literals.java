public class Literals {
    public static void main(String[] args) {
        // Literals in java 
        // 1. Int

        int num = 0b111; // binary numbers 
        System.out.println("num : "+num);
        int num1 = 0x111E; // Hexadecimals numbers
        System.out.println("Hexadecimals num1 : "+num1);
        int longNumber = 10_000_00000; // by this it is easy to count zero values
        System.out.println("long number : "+longNumber);
        double ex_value = 12e25; // exponential values 
        System.out.println("ex_value : "+ex_value);

        char c = 'a';
        System.out.println("c : "+c);
        c++;
        System.out.println("c : "+c);

        char a = '1';
        System.out.println("a : "+a);
        a++;a++;a++;a++;a++;
        System.out.println("a : "+a);
        
    }
}
