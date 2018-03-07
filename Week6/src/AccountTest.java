
public class AccountTest {
	



	    public static void main(String[] args){ //this is our main method
	    	
	    	Account account_test = new Account("bob"); //here we create a new instance of the constructor with 1 variables
	    	Account account_test2 = new Account("john", 231.2); //here we create a new instance of the constructor with 2 variables
	    	Account account_test3 = new Account("mindy", 2000); //here we create a new instance of the constructor with 2 variables
	        Account account_test4 = new Account("richie", 150000, 8.8); //here we create a new instance of the constructor with 3 variables
	        
	        
	        //because a constructor is not set it uses the default constructor made by java where double balance where double values are set to null and int values are set to 0
	        
	        account_test.printAll(); //here we print it out the first method to see if it works
	        account_test2.printAll(); //here we print it out the second method to see if it works
	        account_test3.printAll(); //here we print it out the third method to see if it works
	        account_test4.printAll(); //here we print it out the fourth method to see if it works
	    }
	}

