package pkj1;

public class ContinueS {
	 public static void main(String[] args) {
	        int startRange = 1; // Start of the range
	        int endRange = 10; // End of the range
	        int countEven = 0; // Variable to store the count of even numbers
	        
//	         Iterate through the range
	        for (int i = startRange; i <= endRange; i++) {
	            // Check if the current number is even
	            if (i % 2 == 0) {
	                countEven++; // Increment the count if it's even
	            }
	        }
	        
//	        for (int i startRange; i <= endRange; i++) {
//	        	if(i % 2 == 1) {
//	        		countEven++;
//	        	}
//	        	
//	        }
	        
	        // Print the total count of even numbers
	        System.out.println("Total even numbers between " + startRange + " and " + endRange + " are: " + countEven);
	    }
	}

