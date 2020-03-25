//Unchecked Exceptions and checked at runtimeException
package com.prft.exception;
public class ArrayIndexOutOfBounds_Exception{
	public static void main(String args[]) {
		int a[]=new int[10];
		System.out.println("If you are inserting any value in the wrong index :");
		try {
			a[11]=60;
		}catch (Exception e) {
		System.out.println(e);
		}
		
		}
}