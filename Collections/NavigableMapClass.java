import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
public class NavigableMapClass {
    public static void main(String[] args) {
        NavigableMap<Integer,String> nMap = new TreeMap<Integer,String>();
        SortedMap<Integer,String> sortedMap = new TreeMap<>();
        nMap.put(1, "Cat");
        nMap.put(2, "Dog");
        nMap.put(3, "Cow");
        nMap.put(4, "Lion");
        nMap.put(5, "Tiger");
        System.out.println("map details : "+nMap);

        sortedMap = nMap.headMap(5);  // exclude the given value or less the given value
        sortedMap = nMap.headMap(15); // if the value is greater then map key it gives entire map

        System.out.println("Head map : "+sortedMap);

        Set<Integer> set = nMap.keySet();
        System.out.println("key set : "+set);

        for (Integer integer : nMap.keySet()) {
            System.out.println("Key : "+integer+" value : "+nMap.get(integer));
        }

        System.out.println(nMap.isEmpty());
        System.out.println("First key : "+nMap.firstKey());  // gives the sorted first element of the map

        System.out.println("Last key : "+nMap.lastKey());
        sortedMap = nMap.tailMap(2); // value must be smaller then the max value of the map key if the value is greater 
        // the result map is empty 

        System.out.println("Tail map : "+sortedMap);

        sortedMap = nMap.subMap(0,true, 4,true); // true means include the value

        System.out.println("Sub map : "+sortedMap);

        nMap.clear();
        System.out.println("map details : "+nMap);
    }
}
