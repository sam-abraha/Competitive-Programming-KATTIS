package numbertheory;
import java.util.Scanner;


public class Skocimis {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(Math.max(b - a, c - b) - 1);
	}
	
}