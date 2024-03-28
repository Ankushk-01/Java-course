package interfaces;

public class Demo{
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show method");
        //     }
        // };

        A obj = () -> {
            System.out.println(" inside the show method");
        };
        obj.show();

        A obj2 = () -> System.out.println("declaring show method");
        obj2.show();

        // B obj3 = (int value) -> System.out.println("square root : "+(value*value));
        B obj3 = (value) -> System.out.println("square root : "+(value*value)); //still works

        obj3.squreRoot(12);
    } 
}

interface A {
    void show();
}

interface B {
    void squreRoot(int value);
}
