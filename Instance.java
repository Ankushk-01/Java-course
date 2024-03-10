public class Instance {
    static int data = 10;
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator();
        System.out.println(cal.add(5, 12));
        // System.out.println("Cal is value : "+cal.num);
        System.out.println("data : "+data);
        // System.out.println("Cal1 is value : "+cal1.value);
    }
}


class Calculator 
{
    int num = 10;
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}