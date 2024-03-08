public class Terniory {
    public static void main(String[] args) {
        int x = 6;
        int y = 60;
        int z = 16;
        int result = 0;
        // if(x%2==0){
        //     result = 10;
        // }else{
        //     result = 15;
        // }
        // same thing with this operator ( ? : )
        
        result = (x%2==0) ? 10 :15;
        System.out.println(result);

        //Replace this :

        // if(x>y && x>z){
        //     System.out.println(x+" is greatest number");
        // }else if (y>z) {
        //     System.out.println(y+" is greatest number");
        // }
        // else{
        //     System.out.println(z+" is greatest number");
        // }

        int num = (x>y) ? ((x>z)?x:z):(y>z)?y:z;
        System.out.println("Result : "+num);
    }
}
