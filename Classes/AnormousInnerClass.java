package Classes;
public class AnormousInnerClass {
    // anormous inner class
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in anormous inner class show method");
            }
        };
        obj.show();
    }
}

class A {
    public void show(){
        System.out.println("in the show method");
    }
}
