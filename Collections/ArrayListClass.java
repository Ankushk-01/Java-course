import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ankush");
        names.add("Kunal");
        names.add("Chandan");

        System.out.println("names are : "+names);
        
        names.set(2, "Demo"); 
        System.out.println("names are : "+names);
        names.remove("Ankush");
        System.out.println("names are : "+names);
        names.clear(); 
        
    }
}
