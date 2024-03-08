public class Conditional {
    public static void main(String[] args) {
        int x =280;
        int y =100;
        int z=120;
        if(x>y && x>z){
            System.out.println(x+" is greatest number");
        }else if (y>z) {
            System.out.println(y+" is greatest number");
        }
        else{
            System.out.println(z+" is greatest number");
        }
    }
}
