public class Casting {
    public static void main(String[] args) {
        //When we do explicit type convertion it is called Casting
        int count = 357;
        int data = count%256;
        System.out.println("data : "+data);
        byte byteCount = (byte)count;
        System.out.println("byteCount : "+byteCount);
    }
}
