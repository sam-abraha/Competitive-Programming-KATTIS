package programming_day;

import java.util.Scanner;

public class CuckooClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String currentTime = scanner.nextLine();
        int targetCount = scanner.nextInt();

        // Calculate and output the time when the cuckoo bird finishes sounding off N times
        String resultTime = cuckooFinishTime(currentTime, targetCount);
        System.out.println(resultTime);

        scanner.close();
    }

    private static String cuckooFinishTime(String currentTime, int targetCount) {
        // Parse current time
        String[] timeParts = currentTime.split(":");
        int currentHour = Integer.parseInt(timeParts[0]);
        int currentMinute = Integer.parseInt(timeParts[1]);

        // Initialize counters
        int cuckooCount = 0;

        // Check each minute until the target count is reached
        while (cuckooCount < targetCount) {

        	// check if the sounds of at the hours if so add the hours to the count because e.g. 12:00 12 cuckoos
            if(currentMinute==0 && currentHour >=1 && currentHour <= 12) {
            	cuckooCount+=currentHour;
            }
            
            currentMinute++;
 
            // Check if cuckoo bird sounds off at this minute
            if (currentMinute % 15 == 0) {
            	cuckooCount++;
            }
            
            
            // Check if cuckoo bird sounds off at the hour
            if (currentMinute == 60) {
                currentMinute = 0;
                currentHour = (currentHour % 12) + 1;
            }
        	
          
        }

        // Format the result time
        return String.format("%02d:%02d", currentHour, currentMinute);
    }
}







