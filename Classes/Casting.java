package Classes;
class A{
    public void show1(){
        System.out.println("In class A show method");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In class B show method");
    }
}
public class Casting {
    public static void main(String[] args) {
        A obj = new B();
        // as it have reference of B class but still can't call the `show2` method of B class
        obj.show1();
    }
}
