package pkj1;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args)  
	{  
		
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 
	
	System.out.print("Enter first number- ");  
	int a= sc.nextInt();  
	
	System.out.print("Enter second number- ");  
	int b= sc.nextInt();  
	
	System.out.print("Enter third number- ");  
	int c= sc.nextInt();  
	
	int d=a+b+c;  
	System.out.println("-----------------------------");	System.out.println("Total= " +d);  
	
//	String input 
	Scanner sc1= new Scanner(System.in); //System.in is a standard input stream 
	
	System.out.print("Enter your First Name:- ");  
	String str1= sc1.nextLine();              //reads string   
	
	System.out.print("Enter your Last Name:- ");  
	String str2= sc1.nextLine(); 
	
	System.out.println("--------------------------");
	String str3=str1+" "+str2;
	
	System.out.print("Your Name is: "+str3);             
	
	}  

}