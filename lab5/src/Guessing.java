import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int store = 0; // this is the variable which will hold the guessing number
int highest = 1000; // this holds the highest value
int lowest = 1; //this holds a value that is lower
String usertype = "";

do {
	store = (highest + lowest ) / 2; //this presents the mid point between 1000 and 1
	System.out.println("is your number " + store); //prints the first guess which is 500
	usertype= in.nextLine();
	
	if (usertype.equals("h")) { 
		
		lowest = store + 1; //if the user number is higher than the one presented and they type in H the node will go up by one
		
	}
	
	else if (usertype.equals("l")) {
			highest = store - 1; // if the user number is lower than the one presented and they type in l the node will go down
	}
} while (!usertype.equals("c")); //if they type in c the program will terminate
	in.close();
	}
			
			


	}

