import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> bucketList = new ArrayList<ArrayList<String>>();
        ArrayList<String> bakeryList = new ArrayList<String>();
        ArrayList<String> groceryList = new ArrayList<String>();
        ArrayList<String> fruitList = new ArrayList<String>();

        bakeryList.add("bread");
        bakeryList.add("biscuit");
        bakeryList.add("cake");

        groceryList.add("Oil");
        groceryList.add("flor");
        groceryList.add("paper");
        groceryList.add("lemon");

        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("melon");
        fruitList.add("papaya");

        bucketList.add(groceryList);
        bucketList.add(fruitList);
        bucketList.add(bakeryList);
        System.out.println("bucketList : "+bucketList);
    }
}
