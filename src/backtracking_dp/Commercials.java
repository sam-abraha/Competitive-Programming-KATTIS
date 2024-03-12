package backtracking_dp;

import java.util.Scanner;

public class Commercials {

	public Commercials() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // total number of commercial breaks
		int p = sc.nextInt(); // 
		
		int arr[] = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt()-p; // profit per i-th commercial break
		}
		
		maxSubArraySum(arr);
		
		

	}
	
    public static void maxSubArraySum(int[] a) { // maxSubArraySum using DP 
        int size = a.length;
        int[] dp = new int[size]; // Create an array to store intermediate results
        dp[0] = a[0]; // Initialize the first element of the intermediate array with the first element of the input array // 18
        int ans = dp[0]; // Initialize the answer with the first element of the intermediate array
        for (int i = 1; i < size; i++) {
            // Calculate the maximum of the current element and the sum of the current element and the previous result
        	//System.out.println(a[i] + " " + dp[i-1]);
            dp[i] = Math.max(a[i], a[i] + dp[i - 1]);
            // Update the answer with the maximum value encountered so far
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }

}
