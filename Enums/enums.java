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
        Status s3 = Status.failed;
        switch (s3) {
            case success:
                System.out.println("success");
                break;
        
            case panding:
                System.out.println("panding");
                break;
        
            case running:
                System.out.println("running");
                break;
        
            default:
                System.out.println("Failed");
                break;
        }

        Mobile m1 = Mobile.Redmi;
        System.out.println(m1.getClass().getSuperclass());
        System.out.println(m1.getPrice());
    }
}

enum Status {  // it creates the class of name Status
    running, panding,success,failed   // These are the objects of the class
}

enum Mobile {
    Iphone(1500),Samsung(100),Redmi(80),Vivo(50),Nokia;  // Constructor

    private int price;

    private Mobile(){
        this.price = 30;
    }
    private Mobile(int price){
        this.price = price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}