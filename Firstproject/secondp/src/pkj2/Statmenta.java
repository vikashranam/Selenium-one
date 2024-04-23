package pkj2;

import java.util.Scanner;

public class Statmenta {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		
		System.out.print("Enter First Number: ");  
		int x = sc1.nextInt();
		
		System.out.print("Enter Second Number: ");  
		int y = sc1.nextInt();
		
		  
		if(x+y > 20) {    
		System.out.println("Total is greater than 20");    
		} 
		else {
			System.out.println("Total is less then 20");	
			}

	}

}
