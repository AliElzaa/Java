

public class Account{
//attributes
String name;
int AccountNumber;
Double Balance;

//these variables are the instance variables for the class
static int counter = 0;//this is a variable that will count how many times we use a constructor
//operations
Account(String s){ //constructor 1
	this.name = s;
	counter++;

}

Account(String s, int n){ //constructor 1
	
	this.name = s;
	this.AccountNumber = n;
	counter++;
}
Account(String s, double b){ //constructor 2
	
	this.name = s;
	this.Balance = b;
	counter++;

}

Account(String s,int n,  double b){ //constructor 3
	
	this.name = s;
    this.AccountNumber = n;
    this.Balance = b;

}
String getName(){ // this function would return the name of each method of the constructor
	return this.name;
}

int getAccount(){ // this function would return the account variable of each method of the constructor
	return this.AccountNumber;
}

double getBalance(){ // this function would return the balance variable of each method of the constructor
	return this.Balance;
}



void setName(String name){ // this function allows you to set the name of each constructor instance by just putting it as a parameter
	this.name = name;
}
void setAccount(int AccountNumber){ // this function allows you to set the accountnumber of each constructor instance by just putting it as a parameter
	this.AccountNumber = AccountNumber;
}


void setBalance(double Balance){ // this function allows you to set the balance of each constructor instance by just putting it as a parameter
	this.Balance = Balance; 
}

public double deposit(double d){ // this function allows you to set the deposit of each constructor instance by just putting it as a parameter
    //return the updated balance
    this.Balance +=  d;
    return Balance;

}



public double withdrawl(double funds){
    //allows to withdraw only if there are sufficient funds
   if (this.Balance >= funds){ //says if balance is greater than the the funds

       this.Balance -= funds; //then minus the balance by the funds 
       return Balance; //return the balance after the person has withdrawn the money
   }
    else {
       System.out.println("you have insufficient funds"); // if the user does not have enough funds then it will print you have insufficient funds
       return Balance;
   }

}

public String printAll() {
    System.out.println("name: "+ name + ", accountNumber: " + AccountNumber + ", balance: " + Balance);  //compiles all the strings together
    return null;
}

}
