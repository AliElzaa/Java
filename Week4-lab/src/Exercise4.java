public class Exercise4 {
	
public static void main(String[] args) {
System.out.println(primeNumbers(100));
}

public static int primeNumbers(int n) {
int counter = 0;
	for ( int i= n; i >= 0; --i) { //counts down from the number the users inputs
		if (i % 2 == 0) { //says if anything mod 2 is equal to 0 it is a equal number so skip it
		counter= 0;
		continue;		
		}
		else if (i % 2 == 1) //if any number mod 2 produces a remainder of 1 it is a prime number so return it
		{
			counter ++;
		System.out.println(i + " ");
		
		
		}
		
		
		}

return counter;
}
}