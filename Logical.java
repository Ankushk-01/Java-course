public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double x = 6.5;
        double y = 5.5;

        Boolean result = a <b && x >y; // AND Operator 
        System.out.println("result : "+result);

        result = a>b || x >y; // OR Operator
        System.out.println("reslut : "+result);

        result = !(a>b || x >y);
        System.out.println("result : "+result);
    }
}
