package numbertheory;

import java.util.Scanner;

public class LastFactorialDigit {

	public LastFactorialDigit() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		int test_cases = s.nextInt();
		
		while(test_cases > 0 ) {
			int ans = s.nextInt();
			
			for(int i=ans -1;i > 0 ; i -- ) {
				ans = (ans*i) % 10; // calculate the factorial and only retrieve the last digit 
			}
			System.out.println(ans);
			test_cases--;
		}
		
		s.close();
		
		
	}

}
