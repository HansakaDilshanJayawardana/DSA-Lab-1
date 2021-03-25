package labsheet1;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		StackX st = new StackX(10);//create a stack object
		
		//insert items
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		
		while (!st.isEmpty()) {
			System.out.println(st.pop());//deleted items output
		}
		
		//part c
		System.out.println("Enter an expression ");//prompt message
		Scanner sc = new Scanner(System.in);//create scanner object
		String str = sc.nextLine();//catch the values
		
		int len = str.length();//length of the user input string
		
		StackX stackX = new StackX(len);//create a stack object using that length
		
		//go upto the length of that string 
		for (int x = 0; x < len; x++) {
			char ch = str.charAt(x);//check the character one by one
			//if character is opening bracket
			if (ch == '(') {
				stackX.push(ch);//insert to the stack
			} else if (ch == ')') { //if character is closing bracket 
				char ch2 = stackX.pop();//remove value from the stack
				//if removed value is not a opening bracket
				if (ch2 != '(') {
					System.out.println("Invalid String");//prompt message
					return;
				}
			}
		}
		//whether the stack is empty
		if (stackX.isEmpty())
			System.out.println("Valid String");
		else
			System.out.println("Invalid String");
	}

}
