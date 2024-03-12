package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Attendance {

	public Attendance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int callouts = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
 /* add all names into the list */
		
		for(int i=0;i<callouts;i++) {
			String input = sc.next();
			list.add(input);
		}
		
		for(int i=0;i<callouts;i++) {
			if(!list.get(i++).equals("Present!")) {
				System.out.println(list.get(i));
			}
		}
		/*
		
		for(Integer s : count) {
			System.out.println(s);
		}
		
		if(count.size()==list.size()/2) {
			System.out.println("No Abscences");
		}
		*/

		
		

	}

}
