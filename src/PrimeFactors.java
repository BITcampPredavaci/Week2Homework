import java.util.Scanner;


public class PrimeFactors {

	public static void main(String[] args) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = in.nextInt();
		
		
		for(int i = 2; i <= num / 2; i++){
			//this means that i is a factor of num, now we check if it is prime
			if( num % i == 0 ){
				
				boolean isPrime = true;
				for(int j = 2; j <= i / 2; j++){
					if( i % j == 0 ){
						isPrime = false;
						break; //no need to check any further
					}
				}//end of inner for loop
				
				if( isPrime == true){
					System.out.print(i+" ");
				}
				
			}
		}//end of outer for loop
		in.close();
	}

}
