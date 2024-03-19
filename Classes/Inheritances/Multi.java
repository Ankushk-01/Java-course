package Classes.Inheritances;

class A{
    public int add(int a,int b){
        return a+b;
    }
}
class B extends A{
    public int add(int a,int b){
        return a+b+2; // Added the 2 extra
    }
}
public class Multi {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.add(7,5));
    }
}
