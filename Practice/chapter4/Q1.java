package chapter4;

public class Q1 {

	public static void main(String[] args) {

		char operator = '+';
		int a = 5;
		int b = 10;
		
		/*if (operator == '+') {
			System.out.println(a+b);
		} else if (operator == '-' ) {
			System.out.println(a - b);
		} else if (operator == '*') {
			System.out.println(a*b);
		} else {
			System.out.println(a/b);
		} */
		
		switch (operator) {
			case '+' : System.out.println(a+b);
			 	break;
			case '-' : System.out.println(a-b);
				break;
			case '*' : System.out.println(a*b);
				break;
			default : System.out.println(a/b);
				break;
		}
	}

}
