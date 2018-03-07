public class Exercise1{
	
	public static void main(String[] args) {
	
String [] stringArray = {"computing", "at ","Goldsmiths", "College",
		"University", "of", "London", "New Cross", "London","SE14 6NW"};
			System.out.println(longestStringInArray(stringArray)); // this prints the return value of the method
}
public static String longestStringInArray(String [] a){
	String largestString = a[0]; //sets it to a default value on the first position of the array
 for (int i = 0; i < a.length-1; i++) { //browses through the array
	 if(a[i].length() > largestString.length()) { //if any of the string positions are bigger then default return it
		largestString = a[i];  //put largest value as string
	
	 }
}
 return largestString;
}
}