package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,8,7,6,9,4,3);
        // Predicate<Integer> pre = new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer t) {
        //         if(t%2==0) return true;
        //         return false;
        //     }  
        // };

        // using lambda expression 
        Predicate<Integer> pre = n -> n%2==0;
        // we can replace it with the expression in bellow code by pre

        // Function<Integer,Integer> fun = new Function<Integer,Integer>() {

        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }  
        // };

        // lambda expression of fun 
        
        Function<Integer,Integer> fun = n -> n*2;
        
        int s1 = num.stream()
                            .filter(pre)
                            .map(fun)
                            .reduce(0,(c,e)->c+e);
        // int s1 = num.stream()
        //                     .filter(n->n%2==0)
        //                     .map(n->n*2)
        //                     .reduce(0,(c,e)->c+e);
        
        System.out.println("result : "+s1);
                    
    }
}
