//Unchecked Exceptions and checked at run time
package com.prft.exception;
public class NumberFormat_Exception{
	public static void main(String args[]) {
		String s="Perficient"; 
		System.out.println("converting this variable(s)into digit will occur ");
		try {
			int i=Integer.parseInt(s);
		}catch (Exception e) {
		System.out.println(e);
		}
		
		}
}