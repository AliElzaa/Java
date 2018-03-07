
public class Exercise3 {
	public static void main(String[] args) {
		int [] numbers = {1,100, 200, 300, 250, 216, 500,1000,400}; //the numbers
		System.out.println(duplicates(numbers));
		}
		// add your code here
	public static boolean duplicates(int [] ar){ //takes an array of numbers as input
		boolean foundduplicate = false; //sets the default of the boolean to false
    	  for(int i=0; i<ar.length-1 && !foundduplicate; i++) //checks the array and only runs if no duplicates have been found
    		  for(int j=i+1; j<ar.length && !foundduplicate; j++) //2d loop thats one step ahead of the outer loop 
    			  if(ar[i]==ar[j]) //this checks any 2 positions within the array and checks if they are the same
    				  foundduplicate=true; //if they are return the boolean value of true
    	  return foundduplicate;
	  
	  }
		

}
