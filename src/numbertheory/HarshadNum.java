package numbertheory;

import java.util.Scanner;

public class HarshadNum {

	public HarshadNum() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int cnt = sc.nextInt();
		while (cnt <= Integer.MAX_VALUE) { // endless loop 
			String stringNum = Integer.toString(cnt);  // convert the number into a single string
			int sum = 0;
			for (int i = 0; i < stringNum.length(); i++) {
				
				sum += Integer.parseInt(String.valueOf(stringNum.charAt(i))); // add the numbers to the sum 
			}
			
			if (cnt % sum == 0) {
				System.out.println(cnt);  // print out the number if its a harshard number
				break;
			}
			
			cnt++; // increase the number and repeat the algorithm in order to find the nearest biggest harshard number;
		}
		sc.close();
		
	}

}
