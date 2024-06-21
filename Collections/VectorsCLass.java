import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorsCLass {
    public static void main(String[] args) {
        // Vectors take much time to add the values as compare to the ArrayList
        List<Integer> vectorList = new Vector<>();
        long startTime = System.currentTimeMillis();
        int size = 1_000_000;
        for(int i = 0;i<size;i++){
            vectorList.add(i);
        }
        for(int i = 0;i<size;i++){
            vectorList.add(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Vector size : "+vectorList.size());
        System.out.println("Time taken to add the values in vector : "+(endTime-startTime));

        List<Integer> arrayList = new ArrayList<>();
        startTime = System.currentTimeMillis();
        size = 1_000_000;
        for(int i = 0;i<size;i++){
            arrayList.add(i);
        }
        for(int i = 0;i<size;i++){
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("Vector size : "+arrayList.size());
        System.out.println("Time taken to add the values in vector : "+(endTime-startTime));
    }
}
