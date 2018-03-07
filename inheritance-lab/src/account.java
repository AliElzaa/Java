
public abstract class account {
	protected String id;
	protected double balance;
	 //Initialising the variables
public account(String id,Double balance) {
	this.id = id; //setting the ID up
	this.balance = balance; //setting the balance
	
}

public String getID() {

	return id;	//this just return the id if the function is called
} 

public double getBalance() {
	return balance; //this returns the balance if function is called
}

public String toString() {
	return ("The id:" + this.id + "The balance:" + this.balance); //prints everything together
}

public abstract boolean withdraw(double amount);

//Abstract methods to be implemented within subclasses

public abstract void deposit(double amount);

}

