package lab14;

public class divide {
	
public static double divide(double a, double b) {
if(b==0) {
	throw new IllegalArgumentException("B cannot be zero");
}
return a / b;
}

public static void printQuotient(double a, double b) {
try {
	System.out.println(divide(a,b));
} catch (IllegalArgumentException ff) {
	System.out.println("B is zero try again");
}
}

public static void main(String [] args) {
	
	printQuotient(1,0);
}

}
