package Classes.Inheritances;

public class Annotations {
    public static void main(String[] args) {
        B b = new B();
        b.showTheValueOfTheShowMethod();
    }
}

class A {
    public void showTheValueOfTheShowMethod(){
        System.out.println("Inside the A class show method");
    }
}

class B extends A{
    @Override
    public void showTheValueOfTheShowMethod(){
        System.out.println("Inside the B class show method");
    }

    // if we do some typo in the method name no error will show but intentionly we are doing method overriding but not happening actualy 
    //So we can use annotations to tell the compile what we want to do so that the compiler can send the error if something get wrong at compile time 

    
}