import java.util.EmptyStackException;
import java.util.Stack;

public class Palindrom {
	
	public static boolean isPalindrom(String text) {
		Stack<Character> aStack = new Stack<Character>();
		char m = '\0';

		for (int i = 0; i < text.length(); i++) {
			m = text.charAt(i);

			if (Character.isLetter(m))
				aStack.push(m);
		}
		
		boolean flag = false;
		char letter = '\0';

		try {
			for (int c = 0; c < text.length() && !aStack.isEmpty(); c++) {
				letter = text.charAt(c);

				if (!Character.isLetter(letter))
					continue;

				if (letter != aStack.pop()) {
					flag = true;
					break;
				}
			}
		} catch (EmptyStackException ex) {
			System.err.println("\n" + ex.toString());
		}
		
		return flag;
		
	}

}
