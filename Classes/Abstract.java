package Classes;

public class Abstract {
    public static void main(String[] args) {
        Car c1 = new AdvWagonR();
        c1.drive();
        c1.playMusic();
        c1.fly();
    }
}

abstract class Car{
    public abstract void fly();
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class WagonR extends Car{

    public void drive() {
        System.out.println("Driving car");
    }
    public void horn(){
        System.out.println("Blow horn");
    }
}

class AdvWagonR extends WagonR{

    public void fly() {
        System.out.println("Flying car");
    }
    
}
