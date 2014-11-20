import java.util.Scanner;


public class Salary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the base salary: ");
		double baseSalary = in.nextDouble();
		
		System.out.println("Enter the hours worked: ");
		double hoursWorked = in.nextDouble();
		
		System.out.println("Enter the hourly rate: ");
		double hourlyRate = in.nextDouble();
		
		double salary = baseSalary + hourlyRate * hoursWorked;
		
		System.out.println("The salary is: " + salary);
		
		in.close();
	}

}
