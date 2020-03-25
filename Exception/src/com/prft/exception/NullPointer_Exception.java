//Unchecked Exceptions and checked at run time
package com.prft.exception;
public class NullPointer_Exception{
public static void main(String args[]){
String s="Perficient";
String s1=null;
try {
	s1.toString();
	}
catch(Exception e) {
	System.out.println("Null value then performing any operations this will show "+e);
}
System.out.println("Length of another string "+s.length());
}
}
