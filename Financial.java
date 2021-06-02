package EBook;

import java.util.Scanner; //predefined class

public class Financial {//user defined class
	
	Scanner s = new Scanner (System.in);
		
	double salary, sales, income, expenses, profit, payment;
	String name;
	char choice;
	
	public void calPayment() {  // 1.4 constructor with zero arguments
		do {
		payment++;
	    System.out.print("Enter customer's name    : ");
	    name = s.nextLine();
	    System.out.print("Enter customer's payment : ");
	    payment = s.nextDouble(); 
	   
		System.out.print("\nAdd another details? (Y or N): ");
	    choice = s.next().charAt(0);

	} while (choice == 'Y' || choice == 'y');  }

		public void Expenses()  {   // method to calculate expenses
			System.out.print("Enter the total expenses : ");
			expenses = s.nextDouble();
		}
		public void Income()  {   // method to calculate income
			System.out.print("Enter the total income : ");
			expenses = s.nextDouble();
		}
		
		public void Salary()  {  // method to calculate salary
			System.out.print("Enter the total salary : ");
			salary = s.nextDouble();
		}
		
		public void Sales() {   // method to calculate profit
			profit = payment-(expenses+salary);
		}
		
		public String toString() {
			return "The tottal profit is : RM " + profit;  
		}
}

