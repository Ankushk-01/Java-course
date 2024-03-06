public class Hello {
    public static void main(String[] args) {
        int num = 3;
        int num1 = 24;
        int result = num+num1;
        float decimal = 45.676f;
        double large = 2345.23456789;
        System.out.println(decimal);
        byte data = 127;
        byte data1 = -128;
        short Short = 23456;
        long Long = 1234567890;
        Boolean da = true;
        char first_word = 'a'; // all these values are called literals
        
        System.out.println("data values : "+data+" "+data1);
        System.out.println("sum : "+result);
        System.out.println("Short : "+Short);
        System.out.println("first_word : "+first_word);
        System.out.println("large : "+large+" long : "+Long+" da : "+da);
    }
}