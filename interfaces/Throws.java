package interfaces;

public class Throws {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}

class A {
    public void show() throws ClassNotFoundException{
        // try {   
        //     Class.forName("Throws");
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        // another way 

        Class.forName("Throws");
    }
}