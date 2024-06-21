package Vectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorsMultiThread {
    public static void main(String[] args) {
        List<Integer> vectorList = new Vector<>();
        // List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList = Collections.synchronizedList(new ArrayList<>());
        int size = 1_000_000;
        long startTime = System.currentTimeMillis(); 
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                vectorList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                vectorList.add(i);
            }
        });

        t1.start();
        t2.start();
        try {      
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken by vector : "+(endTime-startTime)+" ms");
        System.out.println("Vector size : "+vectorList.size());

        startTime = System.currentTimeMillis(); 
        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
        });
        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
        });

        t1.start();
        t2.start();
        try {      
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();

        System.out.println("Time taken by arraylist : "+(endTime-startTime)+" ms");
        System.out.println("Arraylist size : "+arrayList.size());

    }
}
