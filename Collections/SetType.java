package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetType {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(1);
        set.add(12);
        set.add(1);
        set.add(12); // drop the same value 

        for(int num : set){
            System.out.println("num : "+num);
        }

        System.out.println("size of set : "+set.size());
    }
}
