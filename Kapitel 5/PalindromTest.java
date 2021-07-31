import java.util.*;

public class PalindromTest {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Text eingeben");
		
		String text = sc.nextLine();
		boolean flag = Palindrom.isPalindrom(text);
	
		if (flag == false)
			System.out.print(" is Palindrome");
		else
			System.out.print(" is Not a Palindrome");
	}

}
