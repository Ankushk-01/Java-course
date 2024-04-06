package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFile {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(223);
        list.add(29);
        list.add(45);
        list.add(78);
        list.add(22);

        System.out.println("list : "+list);

        Collections.sort(list);
        System.out.println("Sorted list : "+list);

        // We need to sort the list on the basic of last digit for that use Comparator

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer num1,Integer num2){

                if (num1%10 > num2%10 ) {
                    return 1;
                }
                return -1;

            }
        };

        Collections.sort(list,com);
        System.out.println("last digit sorted list : "+list);
    }
}
