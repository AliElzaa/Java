public class Exercise2{
	
public static void main(String[] args) {
int [] numbers = {1,100, 200, 300, 250, 216, 500,1000,400}; //this is array input of numbers
System.out.println(isSorted(numbers));
}
public static boolean isSorted(int [] a){
  	 boolean sorted = true; //sets the boolean default value
  	  for(int i=0; i<a.length-1 && sorted; i++) // goes through the array if the sorted == true
  		  for(int j=i+1; j<a.length && sorted; j++) // goes through the array and starts of with one position ahead
  			  if(a[i]>a[j]) //checks if any of the previous value is lower than the next step 
  				  sorted=false; //if it is that means the array is not in ascending order so return value
   
  	  return sorted;
  
  }
}