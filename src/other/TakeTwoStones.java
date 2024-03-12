
package other;

import java.util.Scanner;

public class TakeTwoStones {

	public TakeTwoStones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String winner = input % 2 == 0 ? "Bob" : "Alice";
		System.out.println(winner);
		sc.close();
	}

}
