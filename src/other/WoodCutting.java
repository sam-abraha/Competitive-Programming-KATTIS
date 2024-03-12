package other;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WoodCutting {

	public WoodCutting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int testcases = s.nextInt();

		for (int k=0;k<testcases;k++) {
			
			ArrayList<Integer> list = new ArrayList<>();
			int customers = s.nextInt();
			
			for (int j=0;j<customers;j++) {
				
				int woods=s.nextInt();
				int total=0;
				
				for (int i=0;i<woods;i++) {
					total+=s.nextInt();
				}
				
				list.add(total);
				}
			
			Collections.sort(list);
			
			long sum_in_total=0;
			int sum=0;
			
			for (int i=0;i<list.size();i++) {
				
				 sum+=list.get(i);
				 sum_in_total+=sum;
			}
			
			System.out.printf("%.7f\n" ,(double)sum_in_total/list.size());
		}

			
	}
}


