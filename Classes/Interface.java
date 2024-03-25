package Classes;

public class Interface {
    public static void main(String[] args) {
        // Computer c1 = new Desktop();
        Computer c2 = new Laptop();
        Devloper dev1 = new Devloper();
        // dev1.devApp(c1);
        dev1.devApp(c2);
    }
}

interface Computer {
    public void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("run,Execution,Compilation of code using desktop");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("run, Execution,Compilation of code using Laptop");
    }
}

class Devloper{
    public void devApp(Computer com){
        com.code();
    }
}