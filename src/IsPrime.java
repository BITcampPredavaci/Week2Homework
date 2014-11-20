import java.util.Scanner;


public class IsPrime {

	public static void main(String[] args) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = in.nextInt();
		
		/*
		 * we do not check 1 since every number is divisible by 1
		 * we check only up to num1/2 because numbers greater than that
		 * will not be divisors of the number (test it out)
		 */
		boolean isPrime = true;
		for(int i = 2; i <= num / 2; i++){
			if( num % i == 0 ){
				isPrime = false;
				break; //no need to check any further
			}
		}
		
		//this condition is the same as if we wrote isPrime == false
		if( !isPrime ){
			System.out.println("The number is not prime");
		} else {
			System.out.println("The number is prime");
		}
		in.close();
	}

}
