package Classes;
public class Boxing {
    public static void main(String[] args) {
        int num = 13;
        Integer num2 = new Integer(num); // boxing 

        Integer num3 = num;  // Auto-boxing as it is doing the same above thing but internally.

        System.out.println("num3 : "+num3);

        int value = num2.intValue(); // un-boxing 

        System.out.println("value : "+value);

        int value2 = num3; // Auto unboxing 

        System.out.println("value 2 : "+value2);

        String data = "12345";
        int dataValue = Integer.parseInt(data);

        System.out.println("data Value : "+dataValue);
    }
}
