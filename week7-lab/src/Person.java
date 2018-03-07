import java.util.Calendar; //imports the calender class
// import java.util.Date; //imports the date class

public class Person {
	static String name; //makes the variable name static
	int year = Calendar.getInstance().get(Calendar.YEAR); //this gets the current year we are in
	String DoB; //the user enters in the date of birth
			

Person(String name, String DoB){ //this is a default constructor which takes the date and name
	
	 this.name = name;
	 this.DoB = DoB; //the date of birth must be entered like "15-02-1998"
	
	
}
int age(String DoB) { //is a method that calculates the current age of each person
	String[] storage = DoB.split("-");  //this takes the string and splits it by the regex "-" as well as storing it within a array
	Calendar year = Calendar.getInstance(); //this gets the current year
	int todayYear = year.get(Calendar.YEAR); //stores the current year into a variable
	int birthYear = Integer.parseInt(storage[2]); //takes the array storage and returns the 3rd value which is the year
	int age = todayYear - birthYear; //arithmetic calculation which minuses the current year by the birth year
	
	return age; 
}

String compile(){ //this function compiles each variable together into a sentence that can be readable
	return ("name = " + this.name + " "+ "Age" + age(DoB) + " " + "Date of Birth " +" "+ DoB);


}

void printAll(){
	System.out.println(compile()); // this actually prints the console and output for it
}


}
