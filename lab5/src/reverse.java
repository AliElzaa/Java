import java.io.*;
import java.util.*;


public class reverse {
    public static void main(String [] args) throws IOException {

        Scanner word = new Scanner(System.in); //allows user to enter a word
        System.out.println("Enter file name: ");
        String fileName = word.nextLine(); //this allows the user to enter a file name for the text
        File file = new File(fileName); //it takes the user input file name and allows the program to read if it exist
        Scanner scanner = new Scanner(file);//this means the program now enters the file and is set to the scanner mainfile

        String[] storeWords = scanner.nextLine().split(" "); //splits all the words and stores into a array

        
        System.out.print("Output File Name: ");
        Scanner outputfileName = new Scanner(System.in); // the output file scanner
        String outputfile = outputfileName.nextLine(); //this allows the user to enter a file name for the text
        FileWriter files = new FileWriter(outputfile); //it takes the user input file name and allows the program to read if it exist
        PrintWriter fileWriter = new PrintWriter(files); //the class allows for character writing

                    for (int i = storeWords.length-1; i >=0; i--) { //loops through the array backwards so its in reverse
                        fileWriter.println(storeWords[i]); //writes all the words in the file in reverse order
                    }

                    word.close();
                    scanner.close();
                    outputfileName.close();
                    files.close();
                    fileWriter.close();

        }

    }