public class enums {
    public static void main(String[] args) {
        Status [] s1 = Status.values();
        for(Status s : s1){
            System.out.println("Status : "+s+" value : "+s.ordinal());
        }

        Status s2 = Status.success;
        if (s2 == Status.success) {
            System.out.println("Sucesss");
        }
        else if (s2 == Status.failed) {
            System.out.println("Failed");
        }
        else if (s2 == Status.panding) {
            System.out.println("panding");
        }
        else{
            System.out.println("running");
        }
    }
}

enum Status {  // it creates the class of name Status
    running, panding,success,failed   // These are the objects of the class
}