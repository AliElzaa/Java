
public class CheckingAccount extends account {

 //initializing the variables
    private int numberOfChecksUsed;
    private double balance;

    
    public CheckingAccount(String id, double initialBalance) {
        super(id, initialBalance);  //inherit the variable from main class
        numberOfChecksUsed = 0; //initialization
        this.balance = initialBalance;
    }

   
    public boolean withdraw(double amount) {
    	
    	if (balance - amount - 1 >= 0) { //the balance - amount - £1 fee is greater than 0
    		balance = balance - amount - 1; //then return it true
    		return true;
    	}
		return false;
        //minimum balance should be 0
        //transaction fee is 1
    }
    

    
    public void deposit(double amount) {
        //transaction fee is 1
        balance = balance + amount - 1;
    }


    public void resetChecksUsed() {
        numberOfChecksUsed = 0; //reset the checksused to 0
    }

    public CheckingAccount(String id, Double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	
    public int getChecksUsed() {
        return numberOfChecksUsed; //returns the number of checksused
    }

 
    public boolean withdrawUsingCheck(double amount) {
        // free transaction fee for first three checks
        if (numberOfChecksUsed < 3) {
            //minimum balance should be -10
            if (balance - amount >= -10) {
                balance = balance - amount;
                return true;
            } else {
                return false;
            }
        } else {
            //minimum balance should be -10
            //transaction fee is 2
            if (balance - amount - 2 >= -10) {
                balance = balance - amount - 2;
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
    		CheckingAccount abdul = new CheckingAccount("12",3000);
    		System.out.println(abdul.withdrawUsingCheck(20));

    }
}
