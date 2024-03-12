package other;

import java.util.Scanner;

public class Temperature {

	public Temperature() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int counter=0;
			for (int i = 0; i < n; i++) {
				if (sc.nextInt() < 0) {
					counter++;
				}
			}
			System.out.println(counter);
			sc.close();
		}
}
