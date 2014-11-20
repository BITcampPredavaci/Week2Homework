import java.util.Scanner;


public class PrintSquareAndTriangle {

	public static void main(String[] args) {
		int size = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size: ");
		size = in.nextInt();
		
		/*Printing the square*/
		System.out.println("Square: ");
		for(int i = 0; i < size; i++){
			
			for(int j = 0; j < size; j++ ){
				/*We print a star only if we are in the first or last row
				 * and first or last column
				 */
				if( (i == 0) || (i == size-1) || ( j == 0) || (j == size-1) ){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			//only once we finish with a row we want to move to the next line
			System.out.println("");
		}// end of outer for
		
		/*Printing the triangle*/
		System.out.println("\nTriangle: ");
		for(int i = 1; i <= size; i++){
			
			//printing spaces
			for(int j = 1; j <= (2*(size-i)) / 2; j++){
				System.out.print(" ");
			}
			
			//printing stars
			for(int j = 1; j < 2*i; j++){
				System.out.print("*");
			}
			//Moving to the next line
			System.out.println();
			
		}//end of outer for
		in.close();
	}

}
