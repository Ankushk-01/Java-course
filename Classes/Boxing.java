public class Boxing {
    public static void main(String[] args) {
        int num = 13;
        Integer num2 = new Integer(num); // boxing 

        Integer num3 = num;  // Auto-boxing as it is doing the same above thing but internally.

        System.out.println("num3 : "+num3);
    }
}
