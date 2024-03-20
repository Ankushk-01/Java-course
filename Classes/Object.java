package Classes;

public class Object {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.model = "Asus";
        Laptop l2 = new Laptop();
        l2.model = "Asus";
        System.out.println(l1.equals(l2)); // we can override this method in our base class
        System.out.println(l1);  // by default it runs the .toString() method of Object class
    }
}

class Laptop {
    String model;
    int price;
    public String toString(){
       return ("Overrided toString method");
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public Boolean equals(Laptop l1){
        if (this == l1) {
            return true;
        }
        if (l1 == null) {
            return false;
        }
        if (model == null) {
            if (l1.model != null) {
                return false;
            }
        }else if (!model.equals(l1.model)) {
            return false;
        }
        if (price != l1.price) {
            return false;
        }
        return true;
    }
}
