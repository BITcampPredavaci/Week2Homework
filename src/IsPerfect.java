import java.util.Scanner;


public class IsPerfect {

	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = in.nextInt();
		
		for(int i = 1; i <= num / 2; i++){
			if( num % i == 0){
				sum += i;
			}
		}
		
		if( sum == num){
			System.out.println("The number is perfect");
		} else {
			System.out.println("The number is not perfect");
		}
		
		in.close();
	}

}
