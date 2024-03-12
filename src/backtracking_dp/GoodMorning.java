package backtracking_dp;

import java.util.HashSet;
import java.util.Scanner;

public class GoodMorning {

	public GoodMorning() {
		// TODO Auto-generated constructor stub
	}
	
	public static HashSet<Integer>values;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		values = new HashSet<Integer>();
		
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int k = s.nextInt();
		}

	}
	
	public void generate (int digit,int number) {
		if(number > 200)
			return;
		if(digit==1) {
			generate(2,number);
			generate(4,number);
			number *= 10 + digit;
			if(number < 200)
				values.add(number);
			generate(1,number);
			generate(2,number);
			generate(4,number);
		}
		
		if(digit==2) {
			generate(3,number);
			generate(5,number);
			number *= 10 + digit;
			if(number < 200)
				values.add(number);
			generate(2,number);
			generate(3,number);
			generate(5,number);
		}
		
	}
	
	

}
