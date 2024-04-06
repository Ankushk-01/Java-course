package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ankush");
        names.add("Don");
        names.add("four");
        names.add("Hannah");
        names.add("EL");
        System.out.println("names list : "+names);
        // sort the name on the basic of the length of the names

        Comparator<String> com = new Comparator<String>() {
            public int compare(String firstName,String secondName){
                if (firstName.length() > secondName.length()) {
                    return 1;
                }
                return -1;
            }
        };

        // sorted list on the basic of name length

        Collections.sort(names,com);
        System.out.println("sorted names list : "+names);

    }   
}
