package Classes;

public class Object {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.model = "Asus";
        Laptop l2 = new Laptop();
        l2.model = "Asus";
        System.out.println(l1.equals(l2)); // we can override this method in our base class
    }
}

class Laptop {
    String model;
    int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    // @Override
    // public boolean equals(java.lang.Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Laptop other = (Laptop) obj;
    //     if (model == null) {
    //         if (other.model != null)
    //             return false;
    //     } else if (!model.equals(other.model))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }
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
