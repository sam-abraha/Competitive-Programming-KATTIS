package programming_day;

import java.util.Scanner;

public class MumbleRap {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int N = Integer.parseInt(scanner.nextLine());
	        String inputString = scanner.nextLine();

	        int result = findLargestNumber(inputString);
	        System.out.println(result);
	    }

	    public static int findLargestNumber(String inputString) {
	        int currentNumber = 0;
	        int maxNumber = 0;

	        for (char ch : inputString.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                currentNumber = currentNumber * 10 + Character.getNumericValue(ch);
	               // System.out.println(currentNumber);
	            } else {
	                maxNumber = Math.max(maxNumber, currentNumber);
	                currentNumber = 0;
	            }
	        }

	        // check one last time in case the string ends with a number
	        maxNumber = Math.max(maxNumber, currentNumber);

	        return maxNumber;
	    }
	}


