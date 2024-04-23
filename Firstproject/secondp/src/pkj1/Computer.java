package pkj1;

public class Computer {
	 Computer() {
	      System.out.println("Constructor of Computer class.");
	   }
	   void computer_method() {
	      System.out.println("Power gone! Shut down your PC soon...");
	   }
	   public static void main(String[] args) {
	      Computer c = new Computer();
	      Laptop l = new Laptop();
	      Mouse m = new Mouse();
	      Age a = new Age();
	      
	      System.out.println("------------------------------------------");
	      
	      c.computer_method();
	      l.laptop_method();
	      m.mouse_method();
	      a.age_method();
	      
	   }
	}


	class Laptop {
	   Laptop() {
	      System.out.println("Constructor of Laptop class.");
	   }
	   void laptop_method() {
	      System.out.println("99% Battery available.");
	   }
	}
	
	class Mouse{
		Mouse() {
			System.out.println("Mouse constructor");
		}
		void mouse_method() {
			System.out.println("Mouse working properly");
		}
		
	}
	
	class Age{
		Age() {
			
		}
		void age_method() {
			int number=13;    
		    if(number>0){  
		    System.out.println("POSITIVE");  
		    }else if(number<0){  
		    System.out.println("NEGATIVE");  
		    }else{  
		    System.out.println("ZERO");  
		   }  
		}
		
	}

