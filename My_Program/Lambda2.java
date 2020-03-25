package My_Program;

interface FunctionalInterface{
	void abstractFunc(int a);
	default void  nonabstractFunc() {
		System.out.println("Hello World");
	}
	public class Lambda2{
		public static void main(String args[]) {
			FunctionalInterface object=(int a)->
			System.out.println(a%2==0);
			object.abstractFunc(5);
			object.nonabstractFunc();
			
		}
	}				
}