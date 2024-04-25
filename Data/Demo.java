package Data;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("-------------------Linear Search----------------------");
        int arr[] = {2,3,6,4,2,7,8,1,9};
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the element : ");
            int input = sc.nextInt();
            for(int i =0;i<arr.length;i++){
                if (arr[i] == input) {
                    System.out.println("index : "+i);
                }
            }
            System.out.println("Element not found");

        } catch (Exception e) {
            System.out.println("error : "+e.getMessage());
        }
    }
}
