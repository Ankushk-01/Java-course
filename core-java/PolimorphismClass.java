public class PolimorphismClass {
    public static void main(String[] args) {
        // polymorphism :- The ability of an object which identify as more then one data type
        Car car = new Car();
        Bike bike = new Bike();
        Cycle cycle = new Cycle();
        Vehicle [] vehicles = {car,bike,cycle};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}

class Vehicle {
    public void go(){System.out.println("Vehicle is moving");}
}

class Car extends Vehicle{
    public void go(){System.out.println("Car is moving");}
}
class Cycle extends Vehicle{
    public void go(){System.out.println("Cycle is moving");}
}
class Bike extends Vehicle{
    public void go(){System.out.println("Bike is moving");}
}