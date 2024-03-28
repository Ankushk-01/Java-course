package interfaces;
public class FunctionalInterface {
    public static void main(String[] args) {
        
        //normal way 

        A obj = new A() {
            public int add(int a,int b){
                return a+b;
            }
        };

        System.out.println("sum of : "+obj.add(12, 2));

        // Lambda Expression

        A obj2 = (a,b) -> {
            return a+b;
        } ;
        System.out.println("sum of : "+obj2.add(12, 2));
        A obj3 = (a,b) -> a+b; // also works
        System.out.println("sum of : "+obj3.add(22, 2));
    }
}

interface A {
    int add(int a,int b);
}
