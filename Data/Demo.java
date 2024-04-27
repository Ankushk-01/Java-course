package Data;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter the element : ");
            int input = sc.nextInt();
            int result = linearSearch(arr, input);
            int result2 = binarySearch(arr, result);
            if (result ==-1) {
                System.out.println("Element not found");
            }else{
                System.out.println("Element found at index : "+result);
            }
        } catch (Exception e) {
            System.out.println("error : "+e.getMessage());
        }
    }

    public static int linearSearch(int [] nums,int element){
        int steps = 0;
        for(int i =0;i<nums.length;i++){
            steps++; 
            if (nums[i] == element) {
                System.out.println("number of steps linear search takes : "+steps);
                return i;
            }
        }
        System.out.println("number of steps linear search takes : "+steps);
        return -1;
    }

    public static int binarySearch(int [] input, int element){
        int steps = 0;
        int left = 0;
        int right = input.length-1;
        while(left <= right){
            steps++;
            int mid = (left+right)/2;
            if(element == input[mid]){
                System.out.println("number of steps binary search takes : "+steps);
                return mid;
            }else if (element<mid) {
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println("number of steps binary search takes : "+steps);
        return -1;
    }
}
