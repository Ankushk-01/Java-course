package Opeartors;
public class Operators {
    public static void main(String[] args) {
        int num1 =7;
        int num2 = 5;
        int result = num1+num2;
        System.out.println(result);
        int result1 = num1-num2;
        System.out.println(result1);
        int result2 = num1*num2;
        System.out.println(result2);
        int result3 = num1/num2;
        System.out.println(result3);

        int num = 8;
        num = num +4;
        System.out.println("num : "+num);
        num+=2;
        System.out.println("num : "+num);

        // Pre increment
        int data = ++num; //first increment the value then fetch the value and assigned
        System.out.println("data : "+data);
        // Post increment
        int value = num++; // First assign the value then increments the value 
        System.out.println("value : "+value);
        System.out.println("num value : "+num);

    }
}
