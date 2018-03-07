

public class InvoiceItem{
//attributes

int id;
String description;
int quantity;
double unitPrice;
// these variables are the instance variables for the class
static int counter = 0;
//operations
InvoiceItem(int id, String description, int quantity,double unitPrice){ //constructor 1, this is the default constructor for the prorgam
	id = 20 ;
	description = "delicious";
	quantity =1;
	unitPrice = 2.99;
	counter++;

}


int getId(){ // when this function gets called it returns the variable ID and its value
	return id;
}

String getDescription(){// when this function gets called it returns the variable description and its value
	return this.description;
}

int getQuantity(){// when this function gets called it returns the variable quantity and its value
	return this.quantity;
}

double getUnitPrice(){ // when this function gets called it returns the variable UnitPrice and its value
	return this.unitPrice;
}

void setQuantity(int quantity){ // this function does not return anything as its void but allows you to set the quantity 
	this.quantity = quantity;
}
void setDescription(String description){ // this function does not return anything as its void but allows you to set the description
	this.description = description;
}


void setUnitPrice(double unitPrice){ // this function does not return anything as its void but allows you to set the unitprice
	this.unitPrice = unitPrice;
}



String compile(){ //this function compiles each variable together into a sentence that can be readable
	return ("InvoiceItem id=" + id + " "+ "description=" + description + " " + "quantity= " +" "+ quantity + "unitPrice=" +" "+ unitPrice);


}

void printAll(){
	System.out.println(compile()); // this actually prints the console and output for it
}

public static void main(String[] args) {

InvoiceItem cake= new InvoiceItem(11,"blue",3,2.4); //here we set a method of the class InvoiceItem and make a brand new object
cake.setQuantity(2); //hhere we use the function setquantity to give it a quantity
cake.setUnitPrice(2.99); //here we set the unit price

System.out.println(counter); // here we print counter to count how many times we have used the class

cake.printAll(); // here we call the function that prints compile so that it displays in the console

}

}