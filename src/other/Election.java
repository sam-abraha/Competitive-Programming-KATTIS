
package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Election {

	public Election() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		
		Collections.sort(list);
		
		int ans=0;
		
		for(int i=0;i<(n-1)/2;i++) {
			ans+=list.get(n-i-1);
		}
		
		System.out.print(ans);
}}
