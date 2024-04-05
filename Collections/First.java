package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class First {
    public static void main(String[] args) {
        Collection<String> data = new ArrayList<String>();  // Generics
        data.add("one");
        data.add("two");
        data.add("three");
        System.out.println("data : "+data);

        Collection num = new ArrayList<>();
        // Collection<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add("ankush"); // accidentally added the string instead of int

        System.out.println(" num : "+num);

        for( Object value : num){
            int val = (int)value; // give run time error java.lang.ClassCastException
            System.out.println("num value : "+val);
        }
    }
}
