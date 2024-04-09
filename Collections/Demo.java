package Collections;

public class Demo {
    // var b = 9; // error
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a : "+a);
        var b = 9;
        System.out.println("b : "+b);
        //var c; // show error we need to initialize the variable

        var name = "Ankush";
        System.out.println("name : "+name);

        int nums[] = new int[4];

        var num2 = new int[4];  // not use [] in the var 

        for(int i =0;i<num2.length;i++){
            num2[i] = i;
        }
        for(int i : num2){
            System.out.println("element : "+i);
        }
    }
}
