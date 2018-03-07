import java.io.*;
import java.util.Scanner;

public class Wordcount
    {
    private static Scanner scan;
    private static Scanner userinput;
    public static void main ( String[] args ) throws IOException //deals with IOEExceptions
    {
        userinput = new Scanner( System.in ); //this allows the user to enter in the console
        System.out.print("File name? "); //when the program is run the user is asked for their file name.
        String fileName = userinput.next().trim(); //scans through the file and each text in the file is scanned and split.
        scan = new Scanner( new File(fileName) );
        int counter=0; // counter is initially set to 0
        while(scan.hasNext()) // while loop that goes through each line and increments counter for each word in the file.
    {
          scan.next(); //finds each word within the text file
          counter++; //increments counter for every word found
    }
       System.out.println(counter); //prints out counter which shows many how words are within gthe file

    }
    }