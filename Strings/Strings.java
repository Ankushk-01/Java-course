public class Strings {
    public static void main(String[] args) {
        // String Constant pool
        // Mutable String and Imutable Strings
        String name = "Ankush";
        System.out.println(name);
        // StringBuffer str = new StringBuffer(); Capacity : 16
        StringBuffer str = new StringBuffer("Don "); // Capacity : 19
        System.out.println(str.capacity());
        str.append("Ankush ");
        str.ensureCapacity(10);
        System.out.println(str.capacity());
        System.out.println(str.length());
        str.insert(4,"Dil ");
        System.out.println(str);
    }
}
