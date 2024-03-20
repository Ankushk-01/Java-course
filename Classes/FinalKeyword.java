package Classes;

class FinalKeyword {

    public static void main(String[] args) {
        int num = 9;
        System.out.println("num : "+num);
        num = 17;
        System.out.println("num : "+num);
        final int num2 = 9;
        System.out.println("num : "+num2);
        // num2 = 17; shows error that we cant change the value of an constant value
        // System.out.println("num : "+num2);
        AdvCal cal = new AdvCal();
        cal.add(4, 8);
        cal.show();
        // A a = new A();
        // a.printA(); // we can use the class but can't inherit it
        
    }
}

class Cal {
    public void show(){
        System.out.println("In the show method of class Cal");
    }
    final public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCal extends Cal{
    // final public void add(int a,int b){
    //     System.out.println(a+b);
    // }
    // can't override the final method we can use it but cant update it
    public void show(){
        System.out.println("In the show method of class AdvCal");
    }
}

final class A{  // no one can inherit it we can use it by creating the object of it
    public void printA(){
        System.out.println("In print a method");
    }
}