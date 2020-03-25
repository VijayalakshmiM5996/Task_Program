package Util.Streams;
import java.util.*;
import java.util.stream.*;
class Streams{
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(1,2,3,5,4,2,6,7);
		Stream.Builder<String> builder=Stream.builder();
		Stream<String> stream = builder.add("Not null").build(); 
		IntStream stream1=IntStream.of(100,105,107,104,88);
		IntStream stream2=IntStream.of(101);
		IntStream stream3=IntStream.of(103);
		//lambda expression and collectors
		List<Integer> sum=(List<Integer>) list.stream().collect(Collectors.toSet());
		list.stream().filter(num -> num % 5==0).forEachOrdered(show1->System.out.println("HIIII : "+show1));
		System.out.println("Print the Square of the element using lambda expression and toList method ");
		System.out.println(sum);
	IntSummaryStatistics min_max_avg_sum=stream1.summaryStatistics();	
	
	
	//StringS	
		System.out.println("\nUsing SummaryStatistics to cover the Min value, max value , average, sum and count of the elements "+"\n"+min_max_avg_sum+"\n Concat the element :");
		
		IntStream.concat(stream3, stream2).forEach(show->System.out.print(" "+show+"\n"));
		System.out.println("Counting the value in the Stream : "+stream.count());
		
		IntStream stream4=IntStream.generate(()->{return (int)(Math.random()*10);});
		//stream4.skip(2).forEach(System.out::print);
		stream4.limit(5).forEach(System.out::print);
	}
} 