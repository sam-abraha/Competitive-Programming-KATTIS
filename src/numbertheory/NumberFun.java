package numbertheory;



import java.util.Scanner;

public class NumberFun {

	public NumberFun() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		
		for(int i=0;i<cnt;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if(a+b==c || a-b==c || b-a==c || b/a==c && b%a==0 ||  a/b==c && a%b==0 || a*b==c) {  // test each possible cases 
				System.out.println("Possible");
			}
			else {
				System.out.println("Impossible");
			}
		}

	}

}
