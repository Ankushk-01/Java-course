package Vectors;

import java.util.Collections;
import java.util.Vector;

public class Vectors2 {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add(12);
        v1.add(04);
        v1.add(2024);
        // v1.add("Ankush");
        // v1.add("Kumar");

        System.out.println("Vector : "+v1.toString());
        Collections.sort(v1); 
        System.out.println("Vector : "+v1.toString());

    }
}
