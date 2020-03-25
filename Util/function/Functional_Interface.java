package Util.function;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.function.Function;
public class Functional_Interface {

	public static void main(String[] args) {
		//Consumer accpet Perform action on the given argument
		System.out.print("Consumer - using upperCase method : ");
		Consumer<String> c = (x) -> System.out.println(x.toUpperCase());
	    c.accept("Prft_Trainee");
		// BiConsumer accept two argument and return no result.
		BiConsumer<String, String> biconsumer = (x, y) -> {
		      System.out.println(x);
		      System.out.println(y);
		    };
		    System.out.print("BiConsumer : ");
		    biconsumer.accept("Deepika", "Deekshitha");
		    //BiFunction
		    BiFunction<String,String, String> bifunction = (a, b) -> {
			     return a+b;			      
			    };			    
			    Function<String,String> f = a-> a+"\nShreenath";			    
			    System.out.println(bifunction.andThen(f).apply("Harish", "\nYeswanth"));
			    System.out.println(bifunction.apply("Shruthi ","\nsaranya"));
			    BinaryOperator<Integer>bo=BinaryOperator.minBy(Comparator.reverseOrder());
			    BinaryOperator<Integer>bo1=BinaryOperator.maxBy(Comparator.naturalOrder());
			    System.out.println(bo.apply(2, 3));
			    System.out.println(bo1.apply(2, 3));
			    
	//Bipredicate
			    BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
			    BiPredicate<Integer, Integer> eq = (x, y) -> x -2 > y;
			    //And and OR is acting as logical and and logical or. 
			    System.out.println(bi.and(eq).test(6, 3));
			    System.out.println(bi.or(eq).test(67, 31));
			    System.out.println(bi.negate().test(1, 2));
	//
			    
	}
	
		}

	
