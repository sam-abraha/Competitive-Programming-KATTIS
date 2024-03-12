package other;
import java.util.Scanner;



public class QALY {

	public QALY() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();  // number of periods
		float sum=0;
		
		for(int i=0;i<cnt;i++) {
			sum+= Float.parseFloat(s.next()) * Float.parseFloat(s.next());  // parse and multiply the values and it to the qaly sum
		}
		s.close();
		System.out.println(sum); // print out the accumulated qaly sum
	}

}
