import java.util.Scanner;

/*

Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given interest rate. Also figure out how long it 
will take the user to pay back the loan. For added complexity, add an option for users to select the compounding interval (Monthly, Weekly, Daily, Continually).

*/

public class main{

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("Enter the cost of the floor in metres squared: ");
		System.out.println(calculateCost(width, length, scanner.nextInt()));
	}

	public static int calculateCost(int cost, float interestRate, int numberOfPayments){
		return width * length * cost;
	}

}