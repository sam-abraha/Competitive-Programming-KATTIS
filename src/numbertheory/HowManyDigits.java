package numbertheory;



import java.util.Scanner;

public class HowManyDigits {

	public HowManyDigits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			int x = s.nextInt();
			double cnt = 0;
			
	        if (x <= 1) {
	        	System.out.println(1);
	        }
	        
	        else {
	        	
	        	cnt = (x * Math.log10(x / Math.E) + Math.log10(2 * Math.PI * x) / 2.0); // using kamenetsky formula to have a time complexity of 0(1)
		 
		        System.out.println((int)(Math.floor(cnt)) + 1);
			
	        }
	}
		
	
 }
}
	
