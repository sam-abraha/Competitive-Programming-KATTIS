package backtracking_dp;

import java.util.Scanner;

public class Exam {

	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.nanoTime();
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String my_ans = sc.next();
		String your_ans = sc.next();
		int equal = 0;
		int different = 0;
		
		for(int i=0;i<my_ans.length();i++) {
			if(my_ans.charAt(i)==your_ans.charAt(i)) {
				equal++;
			}
			else {
				different++;
			}
		}
		
		int sol = 0;
		
		if(k>equal) {
			sol = my_ans.length()-(k-equal);
		}
		else {
			sol = k+different;
		}
		
		System.out.println(sol);
	}

}
