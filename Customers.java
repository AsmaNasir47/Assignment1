package EBook;

import java.util.Scanner;//predefined class

public class Customers {//user defined class
	
	Scanner s = new Scanner(System.in);
	
	String name, address, tittle, book, phoneNumber;
	int quantity;
	double price;

	public void getDetails() {
		
		System.out.println("**********Customer's Detail***********");
		
		System.out.println("Name : ");
		name = s.nextLine();
		
		System.out.println("Address: ");
		address = s.nextLine();
		
		System.out.println("Phone number: ");
		phoneNumber= s.nextLine();
	}
	
	public void BookDetails() {
		
		System.out.println("Book's Name: ");
		this.name = s.nextLine();
		
		System.out.println("Book's Tittle: ");
		this.tittle = s.nextLine();
		
		System.out.println("enter quantity:");
		this.quantity = s.nextInt();
		
		System.out.println("enter price:");
		this.price = s.nextDouble();
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getTotPrice() {
		return this.price * this.quantity;
	}
	
	void CustomerDetail(String name, String address, String phoneNumber){ //constructor with 3 argument
		System.out.println("***************Customer's Detail*************");
		System.out.println("Name         : " + name);
		System.out.println("Address      : " + address);
		System.out.println("Phone Number : " + phoneNumber);	
	}
	
	void calcPrice(int q, double p) { //constructor with 2 argument
		this.quantity = q;
		this.price = p;
		double t = q*p;
		System.out.println("Total Price : RM " + t);
	}
}
