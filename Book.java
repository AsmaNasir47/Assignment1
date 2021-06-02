package EBook;

import java.util.Scanner; //predefined class

public class Book {//user defined class
	
	Scanner s = new Scanner(System.in);
	
	String tittle, theme, book;
	double price;
	int quantity;
	char choice;
	
	Book(){
		this.book = "Welcome to our Bookstore!";
	}

	public void BookDetails() {
		char choice;
    	do {
    	System.out.println("Choose theme : " +
    					   "\n************************Types of Book************************" +
    					   "\n 1. Love    " +
    					   "\n 2. Action  " +
    					   "\n 3. History "); 
    	
    	System.out.print("\nEnter your option : ");
    	int o = s.nextInt();
    	switch(o)  {
    	case 1 :s.nextLine();
    	 		System.out.println("Theme   : LOVE"  +
    	 				          "\nTittle	: Anna & Her Locket"  +
    	 				          "\nAuthor	: Gerrat Harway"  +
	  			 				  "\nPrice  : RM19"); 
    	 	break ;
    	 
    	case 2 :System.out.println("Theme     Action"  +
		                           "\nTittle : The Missing Gun"  +
		                           "\nAuthor : Michael Athony"  +
 				                   "\nPrice  : RM23");
    		break ;
    	
    	case 3:	System.out.println("Theme    : History"  +
		                           "\nTittle : The Past & The Future"  +
		                           "\nAuthor : M.Khalid"  +
 				                   "\nPrice  : RM17");
    		break;
    	
    	default :
    		System.out.println("INVALID selection!");  } // end of switch class
    	  // ask to continue
	      System.out.print("\nWould you like to continue? (Y or N): ");
	      choice = s.next().charAt(0);

	} while (choice > 0);
    		
    	}// end of void details()
}
