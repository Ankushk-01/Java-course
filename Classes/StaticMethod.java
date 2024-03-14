package Classes;

public class StaticMethod {
    public static void main(String[] args) {
        Laptop.laptopColor();
        Laptop l1 = new Laptop();
        l1.CPU = "AMD Rizen";
        l1.RAM = 16;
        l1.storage = "256 GB";
        Laptop.laptopInfo(l1);
        Laptop l2 = new Laptop();
        Laptop.laptopInfo(l2);
    }
}

class Laptop{
    static String color;
    String CPU;
    int RAM;
    String storage;
    static{
     color = "Black";
    }
        
    Laptop(){
        CPU = "";
        RAM = 0;
        storage = "";
    }

    public static void laptopColor(){
        System.out.println("Laptop color : "+color);
    }
    public static void laptopInfo(Laptop l1){
        System.out.println("Laptop color : "+color + " CPU : "+l1.CPU+" RAM : "+l1.RAM+" Storage : "+l1.storage);
    }

}