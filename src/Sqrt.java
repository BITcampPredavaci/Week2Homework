import java.util.Scanner;


public class Sqrt {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = in.nextInt();
		
		double result = num, guess = 0;

	    while (guess != result) {
	        guess = result;
	        result = (num / result + result) / 2;
	    }
	   
	    System.out.println("Result: " + result);
	    in.close();
	}

}
