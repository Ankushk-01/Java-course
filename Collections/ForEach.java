package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,7,4,9,6,8);

        // different ways to print list
        for(int i =0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        for(int i : nums){
            System.out.println(i);
        }

        nums.forEach(i -> System.out.println(i)); // new way
        //another way to do the same is 

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }
        // };
        Consumer<Integer> con = (i) ->System.out.println(i);
        
        nums.forEach(con); 
        int sum = 0;

        for(int i : nums){
            if(i%2==0){
                sum += i*2;
            }
        }
        System.out.println("sum : "+sum);

        for(int i =0;i<nums.size();i++){
            int num = nums.get(i);
            if(num%2==0){
                nums.add(i,(num*2));
            }
        }

        System.out.println(nums);
    }
}
