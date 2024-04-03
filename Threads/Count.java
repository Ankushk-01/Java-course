package Threads;

public class Count {
    public static int num = 0;
    public static void main(String[] args) {
        A a = new A();
        Runnable obj1 = ()->{
            for(int i =0;i<100;i++){
                a.increment();
                num = num+1;
                a.printCount();
            }
        };
        Runnable obj2 = ()->{
            for(int i =0;i<100;i++){
                a.increment();
                num++;
                a.printCount();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Join the threads with the main thread
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
         
            e.printStackTrace();
        }

        System.out.println("count : "+a.count);
        System.out.println("num : "+num);
    }
}

class A {
    int count;
    public synchronized void increment(){
        count++;
    }
    public synchronized void printCount(){
        System.out.println("now : "+count);
    }
}