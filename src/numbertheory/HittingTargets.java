
package numbertheory;

import java.util.ArrayList;
import java.util.Scanner;

public class HittingTargets {

	public HittingTargets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>rect = new ArrayList<Integer>();
		ArrayList<Integer>circle = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		int targets = s.nextInt(); // number of targets
		
		for (int i = 0; i < targets; i++)
		{
			
	    String input = s.next();
	    
	    if (input.equals("rectangle"))
	        {
	        for (int z = 0; z < 4; z++)
	        rect.add(s.nextInt()); // add coordinate to the list
	        }
	    if (input.equals("circle"))
	        {
	        for (int z = 0; z < 3; z++)
	        circle.add(s.nextInt()); //add coordinate to the list
	        }
	    }
		
		int n = s.nextInt(); // number of targets
		
		for(int i=0;i<n;i++) {
			
			int dx=s.nextInt(); // x coordinate of a shot
			int dy=s.nextInt(); // y coordinate of a shot
			
			int hits=0; // set hits to 0 for every loop
			
			for(int j=0;j<rect.size();j+=4) {
				if(dx >= rect.get(j) && dy >=rect.get(j+1) && dx <= rect.get(j+2) && dy <= rect.get(j+3)) // check all case needed in order for a hit to take place
				hits++; // increment hit
			}
			
			for(int z=0;z<circle.size();z+=3) {
				double d = Math.sqrt(Math.pow(Math.abs(dx-rect.get(z)),2) + Math.pow(Math.abs(dy-rect.get(z+1)),2));
				int radius = 2;
				if(d<=circle.get(radius))
					hits++; // increment hits;
				
			}
			System.out.println(hits);
		}
		s.close();
		
		

	}

}
