import java.util.Scanner;


public class IsPalindrome {

	public static void main(String[] args) {

		int num = 0, numCopy = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = in.nextInt();
		numCopy = num;

		
		/* we have seen how to get the digits of a number in reverse
		 * now we have to "build" the number in reverse
		 * imagine you have 12345
		 * 1st iteration reversed  = 5
		 * 2nd iteration reversed = 5 * 10 + 4 = 50 + 4 = 54
		 * etc
		 */
		int reversed = 0;
		while( numCopy != 0){
			reversed = reversed * 10 + numCopy % 10;
			numCopy /= 10;
		}
		
		if( reversed == num){
			System.out.println("The number is a palindrome");
		} else {
			System.out.println("The number is not a palindrome");
		}
		
		in.close();
	}

}
