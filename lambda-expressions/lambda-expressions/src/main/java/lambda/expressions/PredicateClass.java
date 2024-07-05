package lambda.expressions;

import java.util.function.Predicate;

public class PredicateClass {
	public static void main(String[] args) {
		Predicate<Integer> divisionBy2  = (number) -> number%2 == 0;
		System.out.println("3 : "+divisionBy2.test(3));
		
		Predicate<Integer> divisionBy3  = (number) -> number%3 == 0;
		System.out.println("3 : "+divisionBy3.test(3));
		
		Predicate<Integer> divisionBy6 = divisionBy2.and(divisionBy3); // if both the predicate gives the value true
		
		System.out.println("divisionBy6 : "+divisionBy6.test(12));
		
		Predicate<Integer> divisionBy2Or3 = divisionBy2.or(divisionBy3);
		
		System.out.println("24 : "+divisionBy2Or3.test(24)); // it will give true is any of the predicate will give the true as a output
		
		Predicate<Integer> negation = divisionBy2.negate(); // negate of divisionBy2 predicate
		
		
		
		
	}
}
