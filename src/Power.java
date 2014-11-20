import java.util.Scanner;


public class Power {

	public static void main(String[] args) {
		
		int base = 0, power = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter base: ");
		base = in.nextInt();
		
		System.out.println("Enter power: ");
		power = in.nextInt();
		
		int result = 1;
		for(int i = 0; i < power; i++){
			result *= base;
		}
		
		System.out.printf("%d ^ %d = %d ", base, power, result);
		
		in.close();
	}

}
