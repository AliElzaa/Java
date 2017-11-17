import java.io.*;
import java.util.Scanner;

public class WordOccurencesinFiles {
    private static Scanner userinput; //our first scanner
    private static Scanner mainFile;  //second scanner

    public static void main(String[] args) throws IOException { //this deals with errors
    userinput = new Scanner(System.in); // this allows the user to input into the console
    System.out.println("Enter file name here: ");  //prints out a message
    String fileName = userinput.nextLine(); //this allows the user to enter a file name for the text
    File file = new File(fileName); //it takes the user input file name and allows the program to read if it exist
    mainFile = new Scanner(file); //this means the program now enters the file and is set to the scanner mainfile
    System.out.println("Which word do you want to print the occurences of?");
    String input = userinput.nextLine();//the word is saved into the variable input

    int counter = 0;
    while(mainFile.hasNext()) { //goes through the file
        if(mainFile.next().equals(input)) //this says if the word in the file matches the user input increment counter
            counter++;  //counter is increment
        }
    System.out.println(counter);
   
}
} //lab2
