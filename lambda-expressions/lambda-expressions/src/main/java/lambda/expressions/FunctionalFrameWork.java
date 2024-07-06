package lambda.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalFrameWork {
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(2,45,3,123,567,7);
		System.out.println("list : "+list);
		Collections.sort(list, (a,b)-> a-b);
		System.out.println("sorted list : "+list);
		
		
		Consumer<Integer> consumer = (a)-> System.out.println(a);
		
		list.forEach(consumer);
		
		Supplier<Integer> random = ()-> (int)(Math.random() *100);
		int num =0;
		while(num <=10) {
			System.out.println("random number : "+random.get());
			num++;
		}
		
		List<Integer> list2 = Arrays.asList(123,35,67,43,775,7);
		list2.forEach(System.out::println);
		
		List<String> names = Arrays.asList("ankush","kumar","don");
		names.sort(String::compareToIgnoreCase);
		
		System.out.println("names : "+names);
		
	}
}