package My_Program;
import java.io.*; 
import java.util.*; 
  
class Array	
{ 
      public static boolean areEqual(int a1[], int a2[]) 
    { 
        int n = a1.length; 
        int m = a2.length; 
      if (n != m) 
            return false; 
        Arrays.sort(a1); 
        Arrays.sort(a2); 
        for (int i = 0; i < n; i++) 
            if (a1[i] != a2[i]) 
                return false; 
          return true; 
    } 
    public static void main(String[] args) 
    { 
        int a1[] = {1,2,3}; 
		int a2[] = { 1,2,3}; 
		  for (int i=0; i<a1.length; i++)  
	           System.out.print(a1[i]+" "); 
	        System.out.println();
	        for (int i=0; i<a2.length; i++)  
	            System.out.print(a2[i]+" "); 
	        System.out.println();
  
        if (areEqual(a1, a2)) 
            System.out.println("True"); 
        else
            System.out.println("False"); 
    } 
} 