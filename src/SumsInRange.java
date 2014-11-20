import java.util.Scanner;

public class SumsInRange {

	public static void main(String[] args) {
		int begin = 0, end = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter begining of range: ");
		begin = in.nextInt();
		System.out.println("Enter end of range: ");
		end = in.nextInt();

		for (int i = begin; i < end; i++) {

			int divisorSum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					divisorSum += j;
				}
			}

			System.out.printf("%d \t %d \n", i, divisorSum);

		}
		in.close();
	}

}
