package pkj1;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args)  
	{  
		
//	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 
	Scanner sc1= new Scanner(System.in);
	
	System.out.print("Enter your First Name:- ");  
	String str1= sc1.nextLine(); 
	
//	if (str1.isEmpty()) {
//        System.out.println("Validation error: Please enter First name");
//    } 
//	else {
//    	System.out.print("Your First Name is:-"+str1 + "\n");
//    }
	
	System.out.print("Enter your Last Name:- ");  
	String str2= sc1.nextLine(); 
	
//	if (str2.isEmpty()) {
//        System.out.println("Validation error: Please enter last name");
//    } else {
//    	System.out.print("Your Last Name is:-"+str2 + "\n");
//    }
	
	System.out.print("Enter your Mobile Number- ");  
	String str3= sc1.nextLine(); 
	
	
//	if (str3.isEmpty()) {
//        System.out.println("");
//    } else {
//    	System.out.print("Your Mobile Number is:-"+str3 + "\n");
//    }
	
	
	System.out.print("Your Name is:-"+str1 + " " + str2 + "\n");
//	System.out.print("Your Last Name is:-"+str2 + "\n"); 
	System.out.print("Your Mobile Number is:-"+str3 + "\n"); 
	

	}
}
