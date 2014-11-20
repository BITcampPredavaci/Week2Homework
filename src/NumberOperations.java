import java.util.Scanner;


public class NumberOperations {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			
			System.out.println("Enter first number: ");
			num1 = in.nextInt();
			
			System.out.println("Enter second number: ");
			num2 = in.nextInt();
			
			if(num1 == 0 && num2 == 0){
				break;
			}
			
			/*
			 * let us make sure that num2 is not zero by swaping the values
			 */
			
			if( num2 == 0 ){
				int temp = num2;
				num2 = num1;
				num1 = temp;
			}
			
			int sum = num1 + num2;
			int diff = num1 - num2;
			int product = num1 * num2;
			double quotient = (double)num1 / num2;
			int module = num1 % num2;
			
			System.out.printf(" %d + %d = %d \n %d - %d = %d \n %d * %d = %d \n %d / %d = %.2f \n %d %% %d = %d \n",
							  num1, num2, sum, num1, num2, diff, num1, num2, product, num1, num2, quotient,
							  num1, num2, module);
			
			
		}while(num1 != 0 || num2 != 0);
		
		in.close();
		System.out.println("Bye bye");
	}

}
