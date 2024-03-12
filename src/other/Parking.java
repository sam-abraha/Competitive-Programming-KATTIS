
package other;

import java.util.Scanner;

public class Parking {

	public Parking() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // read all input values
		int a = sc.nextInt(); // assign the parking prices
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int a1=sc.nextInt(); // assign the arrvial and departure times
		int d1=sc.nextInt();
		int a2=sc.nextInt();
		int d2=sc.nextInt();
		int a3=sc.nextInt();
		int d3=sc.nextInt();
	
	
		int total = 0;
		
		for(int i = 1; i <= 100; i++) {
			int parked_cars= 0; 

			if(a1 <= i && i < d1)  // check how many cars are parked and increase the value of parked_cars
				parked_cars++;
			if(a2 <= i && i < d2) 
				parked_cars++;
			if(a3 <= i && i < d3) 
				parked_cars++;
			
			switch(parked_cars) { // calculate the parking prices according to how many cars are parked
			case 1 : total+=a; break;
			case 2 : total+=2*b; break;
			case 3 : total+=3*c; break;
			}

		}
		
		System.out.println(total); // print out the total price
		
		
	}
	
	

}
