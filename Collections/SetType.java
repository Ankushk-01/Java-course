package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetType {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(1);
        set.add(12);
        set.add(25);
        set.add(16);
        set.add(18);
        set.add(91);
        set.add(12); // drop the same value 

        for(int num : set){
            System.out.println("num : "+num);
        }

        System.out.println("size of set : "+set.size());


        Set<Integer> num1 = new TreeSet<>();
        num1.add(45);
        num1.add(55);
        num1.add(75);
        num1.add(95);
        num1.add(63);

        for(int num : num1 ){
            System.out.println("num1 : "+num);
        }
    }

}
