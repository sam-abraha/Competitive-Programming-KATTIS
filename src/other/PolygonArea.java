
package other;

import java.util.Scanner;

public class PolygonArea {

	public PolygonArea() {
		// TODO Auto-generated constructor stub
	}
	
	public static double area(int [][]arr) {
        int n = arr.length;
        
        //copy initial point to last row
        arr[n - 1][0] = arr[0][0];
        arr[n - 1][1] = arr[0][1];
 
        double det = 0.0;
        //add product of x coordinate of ith point with y coordinate of (i + 1)th point
        for (int i = 0; i < n - 1; i++)
            det += (double)(arr[i][0] * arr[i + 1][1]);
        //subtract product of y coordinate of ith point with x coordinate of (i + 1)th point
        for (int i = 0; i < n - 1; i++)
            det -= (double)(arr[i][1] * arr[i + 1][0]);
 
        //divide by 2 and return
        return det/2;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // number of points
		while(n!=0) {
			int[][] arr = new int[n + 1][2];
		      for (int i = 0; i < n; i++)
		        {
		            arr[i][0] = sc.nextInt(); // read points into the array
		            arr[i][1] = sc.nextInt();
		        }
		      double area = (area(arr)); // return area from area function

		      boolean cw = area < 0; // check whether the polygon was givin in clockwise
		      System.out.println(cw ? String.format("CW %.1f", Math.abs(area)) : String.format("CCW %.1f",area));
		      n = sc.nextInt(); // read next number of points
		}  
	}

}
