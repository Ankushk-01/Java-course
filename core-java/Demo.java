public class Demo {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println("result : "+result);
    }

    public String reverseString(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverseString'");
    }
}


class Calculator 
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}