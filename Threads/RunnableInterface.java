package Threads;

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Runnable obj3 =
            () ->{
                for(int i =0;i<5;i++){
                    System.out.println("Bye");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

class A implements Runnable {
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable {
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
