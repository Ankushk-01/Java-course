package Classes;

public class Interfaces {
    public static void main(String[] args) {

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

interface C {
    void showB();

    void configB();
}
