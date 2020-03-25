package My_Program;

class pyramid{
	public static void main(String args[]) {
		int r=6;
		for(int i=1;i<=r;i++) {
			for(int j=r;j>i;j--) {
				System.out.print(" ");
			} 
			for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
			
			  for (int j = i - 1; j >= 1; j--) {
				  System.out.print(j); }
			 
            System.out.println();
        }
    }
}