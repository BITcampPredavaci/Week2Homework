import java.util.Scanner;


public class CheckSequence {

	public static void main(String[] args) {
		/*
		 * Additional homework: Optimize this code
		 */
		double num = 0, sum = 0;
		boolean allPositive = true, allInt = true, allPrime = true;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Enter next number (0 for terminating): ");
			num = in.nextDouble();
			if( num == 0)
				break;
			
			//adding to the sum
			sum += num;
			
			//check if it is a integer
			if( num != (int) num ){
				allInt = false;
			}
			
			//check if positive
			if( num <= 0 ){
				allPositive = false;
			}
			
			//check if prime
			/*
			 * we do not check 1 since every number is divisible by 1
			 * we check only up to num1/2 because numbers greater than that
			 * will not be divisors of the number (test it out)
			 */
			for(int i = 2; i <= num / 2; i++){
				if( num % i == 0 ){
					allPrime = false;
					break; //no need to check any further
				}
			}
			
		}while(num != 0);
		
		System.out.println("The sum of the numbers is : " + sum);
		if( allPositive ){
			System.out.println("All numbers are bigger than 0");
		} else {
			System.out.println("Not all numbers are bigger than 0");
		}
		
		if( allInt ){
			System.out.println("All numbers are integers");
		} else {
			System.out.println("Not all numbers are integers");
		}
		
		if( allPrime ){
			System.out.println("All numbers are prime");
		} else {
			System.out.println("Not all numbers are prime");
		}
		in.close();
	}

}
