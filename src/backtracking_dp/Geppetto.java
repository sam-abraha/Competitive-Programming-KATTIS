package backtracking_dp;


import java.util.HashSet;
import java.util.Scanner;

public class Geppetto {

	public Geppetto() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean arr[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		arr = new boolean[n+1][n+1];
		for(int i=0;i<m;i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			arr[a][b] = true; // set these indexes to true because these combinations are restrcited on the pizza
			arr[b][a] = true;
		}
		
		
		System.out.println(func(n,new HashSet<Integer>()));
		input.close();

	}
	
	public static int func(int n,HashSet<Integer>s) {
		if(n==0) {
			return 1; // stop if n equals 0 meaning we run out of ingredients
		}
		
		
		boolean conflict = false; // set conflict to false; assuming there is no conflict yet
		int res=0;
		res=func(n-1,s); //
		
		for(int j:s) {
			if(arr[j][n]) { // if the combination is not allowed
				conflict=true; // set conflict true
				break; // break the loop because we dont have to worry about the other integers inside s
			}
		}
		
		
		if(!conflict) { // check if there is no conflict
			s.add(n); // add n to the set
			res+=func(n-1,s); // recursive call for n-1 after adding n
			s.remove(n); // remove the ingredient we just put in so we can backtrack 
		}
		
		return res;
		
	}
	
	
	

}
