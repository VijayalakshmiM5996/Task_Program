//Unchecked Exceptions and checked at run time
package com.prft.exception;
public class Arithmetic_Exception{
	public static void main(String args[]) {
		int a=50;int b=0;
		try {
		int sum=b/a;
		System.out.println(sum);
		//50/0 -> arithmetic exception
		}catch (Exception e) {
		System.out.println(e);
		}
		
		System.out.println("The remaining code will be displayed");
		}
}