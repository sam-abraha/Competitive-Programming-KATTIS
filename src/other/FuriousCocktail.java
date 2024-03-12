package other;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FuriousCocktail {

	public FuriousCocktail() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt()); // add potions to the list
		}
		
		Collections.sort(list,Collections.reverseOrder()); // sort list in descending order
		
		int remaining_time = list.get(0); // set remaining time to duration of the first/longest potion
		
		for(int i=1;i<list.size();i++) {
			
			//check if potion can be drunk otherwise potion will wear off
			if(t>=remaining_time) {
				System.out.println("NO");
				System.exit(0);
			}
			remaining_time = Math.min(remaining_time - t, list.get(i));
			//System.out.println(remaining_time);
		}
		
		System.out.println("YES");

	}

}
