public class Overloading {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println("Sum : " + cal.add(num2, result));
        System.out.println("Sum : " + cal.add(num1, num2, result));
        double num3 = 12.34;
        float num4 = 2.34f;
        System.out.println("Float Sum : "+cal.add(num3, num4,result));
        System.out.println("result : " + result);
    }
}

class Calculator {
    // Mathod Overloading
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, float n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(float n1, float n2, float n3) {
        return n1 + n2 + n3;
    }
}