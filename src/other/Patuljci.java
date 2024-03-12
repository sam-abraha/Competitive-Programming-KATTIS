
package other;

import java.util.ArrayList;
import java.util.Scanner;

public class Patuljci {

	public Patuljci() {
		// TODO Auto-generated constructor stub
	}
	
	void calculate(ArrayList<Integer> list) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum=0;
		for(int i=0;i<9;i++) {
			list.add(sc.nextInt());
			sum+=list.get(i);
		}
		sc.close();
		
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<i;j++) {
				if(sum-list.get(i)-list.get(j)==100) {
					for(int k=0;k<9;k++) {
						if(k!=j && k!=i) {
							System.out.println(list.get(k));
						}
						
					}
				}
			}
		}

	}

}
