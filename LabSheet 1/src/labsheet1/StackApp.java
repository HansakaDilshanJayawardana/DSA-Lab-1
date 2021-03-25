package labsheet1;

public class StackApp {

	public static void main(String[] args) {
		StackX st = new StackX(10);//create a stack object
		
		//insert items
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
