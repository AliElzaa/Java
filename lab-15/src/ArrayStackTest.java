
public class ArrayStackTest {
	public static void main (String[] args) {
		ArrayStack test = new ArrayStack();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		
		System.out.println("top " + test.top());
		
		System.out.println("size " + test.size());
		
		System.out.println("Empty? " + test.isEmpty());		
		
		test.pop();
		
		System.out.println("top " + test.top());
		
		System.out.println("size " + test.size());
		}

}
