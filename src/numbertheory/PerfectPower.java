
package numbertheory;

import java.util.Scanner;

public class PerfectPower {

	public PerfectPower() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) { // loop runs until end of file
			long input = s.nextLong();
			if(input==0)  // break if input equals 0 
				break;
			else
				System.out.println(pp(input));
		}
		
	}
	
   public static long pp(long x) {
	   
	    boolean flag = false;
	    if(x<0) {
	    	flag = true;
	    	x*=-1;
	    }
	    double sqrt = Math.sqrt((double)x);
	    for(int i=2;i<=sqrt;i++) {
			double p = Math.round(Math.log(x)/Math.log(i)); // x =b^p <=> log(base b) x = p <=> logx/logp
			if(x==Math.pow(i, p)) { // check if x = i^p
			/*	if(flag) {
					while(p%2==0) {
						p/=2;
				  }
				}
			*/
				//System.out.println(x);
				//System.out.println(i);
				//System.out.println(p);
				return (long)p; // return the perfect power
		}
		
	 }
		return 1;
		
		
	   
   }
	
	
		
		
}
		    

	