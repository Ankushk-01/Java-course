import java.util.Scanner;

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
        Vehicle v1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Vehicle from options : 1. Car or 2. Bike 3. Cycle : ");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    v1 = new Car();
                    break;
                case 2:
                    v1 = new Bike();
                    break;
                case 3:
                    v1 = new Cycle();
                    break;
                
                default:
                    v1 = new Vehicle();
                    break;
            }

            v1.go();
        } catch (Exception e) {
            System.out.println("Something went wrong");
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