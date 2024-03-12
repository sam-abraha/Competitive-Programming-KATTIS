
package numbertheory;

import java.util.Scanner;

public class MeowFactor {

	public MeowFactor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubn = int(input())
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = 1;
		
	  for(int i=0;i<128;i++) { 
		 if(n% Math.pow(i, 9) == 0) {
			 x=i;
		 }
	  }
	  
	  System.out.println(x);
		
		
		

	}

}
