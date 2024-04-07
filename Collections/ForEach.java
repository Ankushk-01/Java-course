package Collections;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,7,4,9,6,8);

        // different ways to print list
        // for(int i =0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        for(int i : nums){
            System.out.println(i);
        }

        nums.forEach(i -> System.out.println(i)); // new way

        int sum = 0;

        for(int i : nums){
            if(i%2==0){
                sum += i*2;
            }
        }
        System.out.println("sum : "+sum);

        // for(int i =0;i<nums.size();i++){
        //     int num = nums.get(i);
        //     if(num%2==0){
        //         nums.add(i,(num*2));
        //     }
        // }

        // System.out.println(nums);
    }
}
