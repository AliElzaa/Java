public class MyArrayList{
	private static final int SIZE_FACTOR=10; //determines the size of the dynamic array
	private Object data[]; //defines data object
	private int index; //variable
	private int size;  //variable
	
	public MyArrayList(){
		this.data=new Object[SIZE_FACTOR]; //creates an array with the size 10
		this.size=SIZE_FACTOR; //size is set to 10
	}
	public void add(Object obj){
		data[index] = obj; // goes through the array 
		index ++; //increases  index

	}
	public Object get(int i) throws Exception{
		

		return data[i]; //returns the the element specified
	}
	public void remove(int i) throws Exception{
	
		for(int j = i; j <= size; j++ ) { //goes through the array
			data[j] = data[j+1]; //if the element is found that needs to be removed, replace the empty value with the next value.
			size --; //decrease the size of size
			}
		
			
	}
	public static void main(String[] args) throws Exception {
		MyArrayList mal = new MyArrayList(); //initialize a dynamic array
		mal.add("zero"); //add the string to the array
		mal.add("one");//add the string to the array
		mal.add("two"); //add the string to the array
		mal.add("three"); //add the string to the array
		mal.add("four"); //add the string to the array
		mal.add("five"); //add the string to the array
		mal.add("six"); //add the string to the array
		mal.add("seven");//add the string to the array
		mal.add("eight");//add the string to the array
		mal.add("nine");//add the string to the array
		mal.remove(6); //remove element 6
		System.out.println(mal.get(8)); //get the 8th element
		
	}
}