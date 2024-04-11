package Testing;
public class Demo {
    public static void main(String[] args) {
        Cal c = new Cal();
        int result = sum(4,5);
        if (result == 9) {
            System.out.println("test case passed");
        }else{
            System.out.println("test case failed"); 
        }
    }

    public static int sum(int num1,int num2){
        return num1+num2;
    }
}

class Cal {
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public int divide(int num1, int num2){
        return num1/num2;
    }
}