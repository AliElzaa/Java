
public class SavingsAccount extends account {

	
public SavingsAccount(String id, double initialDeposit) {
	super(id, initialDeposit); //inherit from main class these variables
	if(initialDeposit >= 1000) { //if the inital deposit is above 1000
		balance = balance + 10; //add 10 to the balance
	} 
}

public boolean withdraw(double amount) {
    //minimum balance should be 10
    //transaction fee is 3
    if (balance - amount - 3 >= 10) { 
        balance = balance - amount - 3; //add the fees to the acccount
        return true;
    } else {
        return false;
    }
}

public void deposit(double amount) { //deposit is how much is put on above the balance
 balance = balance + amount;
}

public double addInterest(double rate) { //adds interest
    double interest = balance * rate / 100; //the rate of interest is caluclated
    balance = balance + interest; //is then added to the balance
    return interest;
}





}
