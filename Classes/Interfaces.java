package Classes;

public class Interfaces {
    public static void main(String[] args) {
        AudiA4 a1 = new AudiA4();
        a1.run();
        a1.wheels();
    }
}

class B implements A {
    public void show() {
        System.out.println("show method");
    }

    public void config() {
        System.out.println("config method");
    }
}

interface A {
    int num = 13; // static and abstract

    void show();

    void config(); // public and abstract
}

interface Car {
    void wheels();
}

interface Audi extends Car{
    void run();
}

class AudiA4 implements Audi{

    @Override
    public void wheels() {
        System.out.println("it have 4 wheels");
    }

    @Override
    public void run() {
        System.out.println("car running .....");
    }
}