import java.util.Scanner;


public class PrimesInRange {

	public static void main(String[] args) {
		
		int begin = 0, end = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter begining of range: ");
		begin = in.nextInt();
		System.out.println("Enter end of range: ");
		end = in.nextInt();
		
		for(int i = begin; i < end; i++){
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++){
				if( i % j == 0 ){
					isPrime = false;
					break; //no need to check any further
				}
			}
			
			//this condition is the same as if we wrote isPrime == false
			if( isPrime ){
				System.out.print(i + " ");
			}
		}
		in.close();
	}

}
