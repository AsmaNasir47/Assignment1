package EBook;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println();

		Employees e = new Employees();
		e.getName();
		e.getPosition();
		e.getID();
		e.getSalary();
		System.out.println(e.tostring());
		
		Customers c = new Customers();
		c.getPrice();
		c.getQuantity();
		c.getTotPrice();
		System.out.println();
		
		Financial f = new Financial();
		System.out.println(f.toString());
		
		Book b = new Book();
		b.BookDetails();
	
	}

}
