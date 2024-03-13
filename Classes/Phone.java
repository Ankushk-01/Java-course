package Classes;
public class Phone {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "IPhone";
        m1.price = 1500;
        m1.name = "SmartPhone"; // it will update the name for all the objects
        m1.Details();
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1000;
        m2.Details();
        Mobile m3 = new Mobile();
        m3.brand = "RedMi";
        m3.price = 900;
        m3.Details();
    }
}

class Mobile{
    static String name;
    int price;
    String brand; // Common for all the objects

    static { // static block and it is comiplied only once 
        name = "Phone";
        System.out.println("Static block");

    }
    Mobile(){
        System.out.println("Constuctor");
        brand = "";
        price = 0;
    }
    public void Details() {
        System.out.println("Name : "+name+" Brand : "+brand+" price : "+price);
    }
    
}