package Collections;

public class SealedClass {
    public static void main(String[] args) {
        
    }
}

sealed class A permits B,C {
    public void show(){
        System.out.println("show");
    }
}

final class B extends A{
    
}
non-sealed class C extends A{

}
class D extends A{

}