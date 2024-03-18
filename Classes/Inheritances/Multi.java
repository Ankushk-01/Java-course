package Classes.Inheritances;

class A{
    public void name(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    public void name(){
        System.out.println("Method of class B");
    }
}
public class Multi {
    public static void main(String[] args) {
        B b = new B();
        b.name();
    }
}
