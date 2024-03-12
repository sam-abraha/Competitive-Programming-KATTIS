package other;

import java.util.Scanner;



public class TimeLoop {

	public TimeLoop() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String args[]) {
		
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		s.close();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i + " Abracadabra");
		}
		
	}
}
