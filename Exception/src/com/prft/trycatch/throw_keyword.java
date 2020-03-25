package com.prft.trycatch;

import java.io.IOException;

public class throw_keyword{
/*	static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }
	
}*/
	
	  void run()throws IOException{  
	    throw new IOException();//checked exception  
	  }  
	  void slow()throws IOException{  
	    run();  
	  }  
	  void pen(){  
	   try{  
	    slow();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   throw_keyword obj=new throw_keyword();  
	   obj.pen();  
	   System.out.println("normal flow...");
	   System.out.println("using throw and throws");
	  }  
	}  