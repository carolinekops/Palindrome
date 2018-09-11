import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word to check if it is a palindrome.");
		String input = scan.nextLine().toLowerCase();
		
		StringBuilder newinput = new StringBuilder(input);
		String reversed = newinput.reverse().toString();

		
		if(reversed.equals(input)) {
			System.out.println("Yes, this is a palindrom");
		}
			
		else {
			System.out.println("This is not a palindrome.");
		}
		scan.close();
	}

}
