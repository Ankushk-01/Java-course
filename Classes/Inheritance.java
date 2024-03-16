package Classes;

import javax.management.ObjectName;

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
        super("Ankush");
        System.out.println(" Inside the B constructor");
    }

    public B(String name){
        this();
        System.out.println("B class peramitarized constructor called with value : "+name);
    }
    public void show(){
        System.out.println("show method");
    }
}
public class Inheritance extends Object{
    public static void main(String[] args) {
        B b = new B();
        // B b1 = new B("Ankush");
        // System.out.println(b1);

        new B().show(); // anormous object it create the object but we can't use it again
    }
}
