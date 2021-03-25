package labsheet1;

public class StackX {
	//declare variables
	private int top;//top of stack
	private char[] stackArray;//stack array char type
	private int maxSize;//size of stack array
	
	//constructor
	public StackX(int s) {
		//initialization of above variables
		maxSize = s;//set array size
		top = -1;//no items
		stackArray = new char[maxSize];
	}
	
	//push method (insert a value)
	public void push(char j) {
		//check whether stack is full
		if (top == maxSize - 1) {
			System.out.println("Stack is full");//prompt message
		}
		//stack is not full
		else {
			stackArray[++top]=j;//increment location by one (current top increment by one)
		}
	}
	
	//pop method (remove a value)
	public char pop() {
		//check whether stack is empty
		if (top == -1) {
			System.out.println("Stack is empty");//prompt message
			return ' ';
		}
		//stack is not empty
		else {
			return stackArray[top--];//current top decrement by one
		}
	}
	
	//peek method
	public char peek() {
		//check whether stack is empty
		if (top == -1) {
			System.out.println("Stack is empty");//prompt message
			return ' ';
		}
		//stack is not empty
		else {
			return stackArray[top];
		}
	}
	
	//isEmpty method
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//isFUll method
	public boolean isFull() {
		return (top == maxSize - 1);
	}	

}
