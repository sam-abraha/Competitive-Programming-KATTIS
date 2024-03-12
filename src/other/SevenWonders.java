package other;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SevenWonders {

	public SevenWonders() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int countT = 0; int countG = 0 ;int countC = 0;
		
		for(int i=0;i<input.length();i++) {
			switch(input.charAt(i)) {
			case 'T' : countT++;break;
			case 'G' : countG++;break;
			case 'C' : countC++;break;
			}
		}
		
		int ans = (int) Math.round(Math.pow(countT,2) + Math.pow(countG,2) + Math.pow(countC,2));
		
		int sets = 0;
		while(countT >=1 && countG >=1 && countC>=1) {
			sets++;
			countT--;
			countG--;
			countC--;
		}
		
		ans+=sets*7;
		System.out.println(ans);
		s.close();

	}

}
