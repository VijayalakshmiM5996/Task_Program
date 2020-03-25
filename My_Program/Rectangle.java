package My_Program;

import java.io.*;   
public class Rectangle { 
	  public static void main(String args[])
    { int n=21;
    //i=row and j=column
    for(int i=0;i<21;i++) {
    	for(int j=0;j<21;j++) {
    		
    		 if((i==0 ||i==20)&&(j==0 ||j==20))    			
    			System.out.print("+");
    		
    		else if(i==0||i==20) {
    			System.out.print("-");
    		}
    		else if(j==0 || j==20) {   			
    			System.out.print("|");
    		}
    		
    		else if((i==j) && (i+j) ==(n-1)) {
    			System.out.print("X");}
    		 
    			 else if((j==0 || i==n/2)||(i==0||j==n/2))
   			  { System.out.print("*"); }
    		
    		else if(i==j) {
    			System.out.print("\\");
    		}
    		
    		else if((i+j) == (n-1)) {
    			System.out.print("/");
    		}
    		else {
    			System.out.print(" ");
    	}
    }
    	System.out.println();
    }
    	
    }
    }

   
    
        
     
 
  
