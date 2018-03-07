public class Exercise5 {

	public static void main(String[] args) {
		
		
		String input= "Studying at Goldsmiths College, studying at Goldsmiths is fun. Studying requires hard work.";
		int numberOfWords = wordCount(input); // this takes the string input splits it and and counts how many words there are within the string
		
		String[] words = new String[numberOfWords]; // this takes the string input and runs it through the method to find out the number of words
		int[] numbers = new int[numberOfWords]; //takes the number of words used and stores it in this variable
		
		words = wordOccurrences(numbers, input, numberOfWords);
	
		for (int i = 0; i < words.length; i++) {//goes through the array of words
       if (words[i] != null) //since duplicates positions are turned into null we cannot print them
				System.out.println(words[i]); //print out each word within the array
		}
	}

	public static String[] wordOccurrences(int[] numbers, String st, int number) {  //this will take 3 inputs which are the number of words, the string input and


		
		String[] result = new String[number]; //makes results the maximum number of words
		
		int counter = 0;
		int index = 0;

		String [] splitst = st.split("[\\p{Punct}\\s]+");//this splits the input and stores it in a array, the regex here is by whitespace and punctuation

		for(int i = 0; i < splitst.length; i++) {
			
			//System.out.println(splitst[i]);
			if (checkArray(result, splitst[i]) == false) { //if the word has not been checked before
				//System.out.println("false!");
				result[counter] = splitst[i]; //put the word in the results array
				numbers[counter] = 1; //add a 1 to it since it has been detected once
				counter++; //move on to the next word
			}
			else {
				index = findIndex(result, splitst[i]);
				numbers[index]++; //if the word has been visited before and it adds another number to the amount of times it is found again
			}

		}
		
		for (int j = 0; j < result.length; j++) {
			if (result[j] != null) result[j] = result[j] + " " + numbers[j]; //printing out the words + the number of times it appears
		}
 
		return result;
		
	}
	
	public static int wordCount(String st) {
	
		
		int words = 0; //variable to calculate the word count

		String [] splitst = st.split("\\s+"); //splits the string input

		for(int i = 0; i <= splitst.length-1; i++) { //goes through the array 
			
			words++; //adds 1 to the int for every word within the input

		}
			
		return words; //return the word count of the string input
		
	}
	
	public static Boolean checkArray(String[] array, String word) {
		
		for (int i = 0; i < array.length; i++) {
			if (word.equals(array[i]) == true) return true; //checks if there is a match between the words of the string input
		}
		
		return false;
	
	}
	
	public static int findIndex(String[] array, String word) { //this takes the array of split words
		
		for (int i = 0; i < array.length; i++) {
			if (word.equals(array[i]) == true) return i; //if the string mathches the array of words it returs the index position of each
		}
		
		return 0;//
		
	}
	
}

//1. remove duplicates
//2. #count the input words