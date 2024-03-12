package backtracking_dp;

import java.util.Scanner;

public class Pebble {

	public Pebble() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			StringBuilder board = new StringBuilder(sc.next());
			int min = func(board);
			System.out.println(min);
			
		}
			

	}
	
	public static int func(StringBuilder board) {
		
		int min=0;
		
		for(int i=0;i<board.length();i++) {
			if(board.charAt(i)=='o') {
				min++;
			}
		}
		
		for(int i=0;i<board.length()-2;i++) {
			if(board.charAt(i)=='o' && board.charAt(i+1)=='o' && board.charAt(i+2)=='-') {
				board.setCharAt(i,'-');
				board.setCharAt(i+1,'-');
				board.setCharAt(i+2,'o');
				int value = func(board);
				if (value < min) {
					min = value;
				}
				board.setCharAt(i,'o');
				board.setCharAt(i+1,'o');
				board.setCharAt(i+2,'-');
			}
		}
		
		
		for(int i=board.length()-1;i>2;i--) {
			if(board.charAt(i)=='o' && board.charAt(i-1)=='o' && board.charAt(i-2)=='-') {
				board.setCharAt(i, '-');
				board.setCharAt(i-1, '-');
				board.setCharAt(i-2, 'o');
				int value = func(board);
				if (value < min) {
					min = value;
				}
				board.setCharAt(i, 'o');
				board.setCharAt(i-1, 'o');
				board.setCharAt(i-2, '-');
			}
		}
		
		
		return min;
		
	}

}
