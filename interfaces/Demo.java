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
    }
}

interface A {
    public void show();
}
