package Classes;
class A {
    public A(){
        System.out.println(" Inside the A constructor");
    }
}
class B extends A {
    public B(){
        System.out.println(" Inside the B constructor");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
    }
}
