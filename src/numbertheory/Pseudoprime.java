package numbertheory;

import java.util.Scanner;

public class Pseudoprime {

	public Pseudoprime() {
		// TODO Auto-generated constructor stub
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int p = s.nextInt();
		System.out.println(bigMod(3,2,2));
	}
	
	static boolean prime(int n) {
		if(n==2 ) return true;
		if(n<2 || n%2==0) return false;
		double sqrt = Math.sqrt(n);
		for(int i=0;i<sqrt;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static int bigMod(int a,int n,int p) {
		if(n==0) return 1;
		if(n==1) return a % p;
		if(n%2==0) {
			int res = bigMod(a,n/2,p) % p;
			return (res %p ) * (res % p) % p;
		}
		else {
			return bigMod(a,n-1,p)*a %p;
		}
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int prime = s.nextInt();
		
		if(prime(base)==true) {
			System.out.println("no");
		}
		
		if(base==0 && prime==0) {
			System.out.println("no");
		}
		if(bigMod(base,prime,prime)==base && !prime(prime)) {
			System.out.println("yes");
		}
	}

}
