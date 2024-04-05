package Collections;
import java.util.List;
import java.util.ArrayList;
public class ListType {
    public static void main(String[] args) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(7);
        row.add(5);
        row.add(9);
        row.add(12);
        System.out.println("row : "+row);
        System.out.println("index of 12 : "+row.indexOf(12));
        System.out.println("size : "+row.size());
    }
}
