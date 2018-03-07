import java.util.*;


public class Bank {

	 private double savingsInterestRate; //this is going to save the intereset rates

   
    private final ArrayList<account> accounts; //stores the different acounts
    
     
   
   
    public Bank() {
        accounts = new ArrayList<account>(); //creates  a array list
    }

   
    public void setSavingsInterest(double rate) {
        this.savingsInterestRate = rate;
    }

   
    public int numberOfAccounts() { //this returns the number of accounts
        return accounts.size();
    }

  
    public void addAccount(account i) {  //this adds an account
        accounts.add(i);
    }


    public account getAccount(String accountID) {
        for (account account : accounts) { //goes through the list of account
            if (account.getID().equals(accountID)) { //gets the accountID v
                return account; //returns the account
            }
        }
        return null;
    }

   
    public boolean deposit(String accountID, double amount) {
        account account = getAccount(accountID); //gets the account id
        if (accountID != null) { //when it finds the accountID
            account.deposit(amount); //it deposits the amount to that accountID
            return true;
        } else {
            return false;
        }
    }


    public boolean withdraw(String accountID, double amount) {
        account account = getAccount(accountID);//gets the account id
        if (accountID != null) { //when it finds the accountID
            return account.withdraw(amount); //withdraws the amount from the balance
        } else {
            return false;
        }
    }


    public boolean transfer(String fromAccountID, String toAccountID, double amount) { //takes in a few variables as a parameter
        account fromAccount = getAccount(fromAccountID); //this gets the AccountId
        account toAccount = getAccount(toAccountID); //this gets the location to send it too
        if (fromAccount != null && toAccount != null) { //if they both have a value from and to
            if (fromAccount.withdraw(amount)) {  //once the amount is taken from the account
                toAccount.deposit(amount); //deposit the amount on the toaccount
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public void addInterest() {
        for (account account : accounts) { //goes through the accounts
            if (account instanceof SavingsAccount) { 
                SavingsAccount savingAccount = (SavingsAccount) account;
                savingAccount.addInterest(savingsInterestRate);  //adds the interest rate to the savingsaccounts
            }
        }
    }

  
    public void reset() {
        for (account account : accounts) { //loops through the account
            if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                checkingAccount.resetChecksUsed(); //resets the amount of checks used
            }
        }
    }
    
    public static void main(String[] args) {
		CheckingAccount abdul = new CheckingAccount("12",3000);
		Bank acc = new Bank();
		acc.addAccount(abdul);
		CheckingAccount samuel = new CheckingAccount("4",80);
		Bank acc2 = new Bank();
		acc.addAccount(samuel);
		
		System.out.println(acc.numberOfAccounts());
		System.out.println(acc2.numberOfAccounts());
}
}
