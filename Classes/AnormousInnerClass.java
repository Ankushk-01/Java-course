package Classes;
public class AnormousInnerClass {
    // anormous inner class
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in anormous inner class show method");
            }
        };
        obj.show(); // This will print "in anormous inner class show method"
    }
}

class A {
    public void show(){
        System.out.println("in the show method");
    }
}
