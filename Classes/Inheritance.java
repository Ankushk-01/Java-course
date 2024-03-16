package Classes;
class A {
    public A(){
        System.out.println(" Inside the A constructor");
    }
    public A(String name){
        System.out.println("A class peramitarized constructor called with value : "+name);
    }
}
class B extends A {
    public B(){
        System.out.println(" Inside the B constructor");
    }

    public B(String name){
        super(name);
        System.out.println("B class peramitarized constructor called with value : "+name);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // B b = new B();
        B b1 = new B("Ankush");
    }
}
