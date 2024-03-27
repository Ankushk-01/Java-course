package Classes.Inheritances;

public class Annotations {
    public static void main(String[] args) {
        
    }
}

class A {
    public void showTheValueOfTheShowMethod(){
        System.out.println("Inside the A class show method");
    }
}

class B extends A{
    public void showTheValuOfTheShowMethod(){
        System.out.println("Inside the B class show method");
    }

    // if we do some typo in the method name no error will show but intentionly we are doing method overriding but not happening actualy 
    
}