

public class InvoiceItem{
//attributes

int id;
String description;
int quantity;
double unitPrice;

static int counter = 0;
//operations
InvoiceItem(int id, String description, int quantity,double unitPrice){ //constructor 1
	id = 20 ;
	description = "delicious";
	quantity =1;
	unitPrice = 2.99;
	counter++;

}


int getId(){
	return id;
}

String getDescription(){
	return this.description;
}

int getQuantity(){
	return this.quantity;
}

double getUnitPrice(){
	return this.unitPrice;
}

void setQuantity(int quantity){
	this.quantity = quantity;
}

void setUnitPrice(double unitPrice){
	this.unitPrice = unitPrice;
}



String compile(){
	return ("InvoiceItem id=" + id+ "description=" + description+ "quantity= " + quantity + "unitPrice=" + unitPrice);


}

void printAll(){
	System.out.println(compile());
}

public static void main(String[] args) {

InvoiceItem cake= new InvoiceItem(11,"blue",3,2.4);
cake.setDescription("Toyota");
cake.setQuantity("Prius");
cake.setUnitPrice(£2.99);

System.out.println(counter);
}

}