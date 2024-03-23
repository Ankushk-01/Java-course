package Classes;
public class InnerClass
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        System.out.println(" num : "+obj.num);
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
}