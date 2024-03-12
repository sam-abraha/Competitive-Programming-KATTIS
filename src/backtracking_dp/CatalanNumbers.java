package backtracking_dp;

/**
* Ausgewaehlte Probleme aus dem ACM Programming Contest  WiSe 2023/2024
* Problem: Exam
* Link: https://open.kattis.com/contests/qkcqgi/problems/exam
* @author Samuel Abraha
* @version 1.0, 01/17/2023
* Method : Ad-Hoc 
* Runtime: 0.1s
* Status : Accepted 
*/

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumbers {

	public CatalanNumbers() {
		// TODO Auto-generated constructor stub
	}
	
	static BigInteger catalan(int x) {
		
		
		BigInteger num = factorial(2 * x).divide(factorial(x + 1).multiply(factorial(x)));
		return num;
		
	}
	
	static BigInteger factorial(int n) {
		
        BigInteger counter = BigInteger.ONE; 
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(counter);
            counter = counter.add(BigInteger.ONE);
        }
        return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=0;i<input;i++) {
			int x = sc.nextInt();
			System.out.println(catalan(x));
		}

	}

}
