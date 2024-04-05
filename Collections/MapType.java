package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapType {
    public static void main(String[] args) {
        
        Map<String,Integer> data = new HashMap<String,Integer>();
        data.put("Ankush", 85); // Key must be unique
        data.put("Ankush", 85);
        data.put("Chandan", 90);
        data.put("gagan", 75);
        data.put("Vinay", 55);

        System.out.println("data : "+data);
    }
}
