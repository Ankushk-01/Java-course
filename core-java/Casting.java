public class Casting {
    public static void main(String[] args) {
        //When we do explicit type convertion it is called Casting
        int count = 357;
        int data = count%256;
        System.out.println("data : "+data);
        byte byteCount = (byte)count;
        System.out.println("byteCount : "+byteCount);

        // Type Permossions

        byte num1 = 30;
        byte num2 = 10;
        int result = num1*num2; // the value of it will be 300 which is higher then the range of byte so it will be permoted to the int data type
        System.out.println("result : "+result);
        byte trim = (byte) result;
        System.out.println("trim : "+trim);
    }
}
