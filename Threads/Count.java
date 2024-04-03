package Threads;

public class Count {
    public static int num = 0;
    public static void main(String[] args) {
        A a = new A();
        Runnable obj1 = ()->{
            for(int i =0;i<1000;i++){
                a.increment();
                num = num+1;
            }
        };
        Runnable obj2 = ()->{
            for(int i =0;i<1000;i++){
                a.increment();
                num++;
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        System.out.println("count : "+a.count);
        System.out.println("num : "+num);
    }
}

class A {
    int count;
    public void increment(){
        count++;
    }
}