public class enums {
    public static void main(String[] args) {
        Status [] s1 = Status.values();
        for(Status s : s1){
            System.out.println("Status : "+s+" value : "+s.ordinal());
        }
    }
}

enum Status {  // it creates the class of name Status
    running, panding,success,failed   // These are the objects of the class
}