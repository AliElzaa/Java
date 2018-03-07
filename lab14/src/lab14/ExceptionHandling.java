package lab14;

public class ExceptionHandling {
	public static void main (String[]args) {
		String[] s = {"abc", "123", null, "xyz"};
		for (int i = 0; i < s.length; i++) 
		{
			
			try {
				int a = s[i].length(); 
			System.out.println(s[i+1]); //this line ill cause java.lang.NullPointerException as you cannot add 1 to null
			a = Integer.parseInt(s[i]); //This line will cause NumberFormatException as you cannot convert "ABC" to a int"
			} catch (java.lang.NullPointerException  ff) {
				System.out.println("Cannot add 1 to null");
			} catch (ArrayIndexOutOfBoundsException f2) {
				System.out.println("Out of bounds");
			} catch (NumberFormatException f3) {
				System.out.println("cannot convert ABC to int");
			}
	
		}
			
	}
}
