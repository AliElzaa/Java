import java.io.*;
import java.util.Scanner;

public class Longestinfile
{
    public static void main(String [] args) throws IOException 
{

Scanner word = new Scanner(System.in);
System.out.println("Enter file name: ");
String fileName = word.nextLine();
File file = new File(fileName);
Scanner scanner = new Scanner(file);
String current;
String next = "";

while (scanner.hasNext())
{
    current = scanner.next();

    if(current.length() > next.length()) {
            next = current;

}
}
System.out.println("Largest String = " + next);

}
}