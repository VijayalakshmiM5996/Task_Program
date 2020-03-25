//try-catch-finally
package com.prft.trycatch;
public class try_catch_finally{
public static void main(String args[]){
String s="Perficient";
String s1=null;
try {
	s1.toString();
	}
catch(Exception e) {
	System.out.println("Null value then performing any operations this will show "+e);
}
finally {
System.out.println("Finally is executed when the exception is occured or not ....");
}
System.out.println("Length of another string "+s.length());
}
}

