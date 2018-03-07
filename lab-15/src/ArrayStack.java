
class ArrayStack{
private Object [] array;
private int count;
public static final int MAX = 100;
private int stacksize;

public ArrayStack() {
	array = new Object [MAX];
	count = 0;
	stacksize = -1;
	
	
}

public Object top() { //returns last added element
return array[count-1];

}

public void pop() { // removes last added element
count--;
}
//newArray[]
//loop to duplicate length -1 
//newArray[i] = array[i];
//end for
//array = newArray;


																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
public void push(Object obj) { // add element to the stack
	 if(stacksize + 1 < MAX) {
		stacksize++; 
		array[stacksize] = obj;
	 } else System.out.println("sorry but the stack is full");
}

public int size() { //returns the size of the stack
return count;
		}
public boolean isEmpty() { // checks if the stack is empty
	return count==0;
}
	
}