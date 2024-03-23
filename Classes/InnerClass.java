package Classes;
public class InnerClass
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        System.out.println(" num : "+obj.num);
        A.B obj1 = obj.new B();
        obj1.config();
        A.C obj2 = new A.C(); // static inner class
        obj2.done();
    }
}

class A {
    int num = 10;

    public void show(){
        System.out.println("in show method");
    }
    
    class B {
        public void config(){
            System.out.println("in config method");
        }
    }
    static class C {
        public void done(){
            System.out.println("in config method");
        }
    }
}