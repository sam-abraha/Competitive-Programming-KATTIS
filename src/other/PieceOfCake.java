package other;
import java.util.Scanner;

public class PieceOfCake {

	public PieceOfCake() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,h,v=0;
		n=sc.nextInt();
		h=sc.nextInt();
		v=sc.nextInt();
		
		int a = (h > (n-h)) ? h : n-h;
		int b = (v > (n-v)) ? v : n-v;
		System.out.println(a*b*4);
	}

}
