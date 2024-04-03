package Threads;

public class Count {
    public static void main(String[] args) {
        A a = new A();
        Runnable obj1 = ()->{
            for(int i =0;i<1000;i++){
                a.increment();
            }
        };
        Runnable obj2 = ()->{
            for(int i =0;i<1000;i++){
                a.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

class A {
    int count = 0;
    public void increment(){
        count++;
    }
}