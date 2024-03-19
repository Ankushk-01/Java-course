package Classes;

class A {
    public void show(){
        System.out.println("in A show method");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show method");
    }
}
class C extends A {
    public void show(){
        System.out.println("in C show method");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
