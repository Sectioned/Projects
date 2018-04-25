import java.util.Scanner;

/*

Have the program find prime numbers until the user chooses to stop asking for the next one.

*/

public class main{

	public static Scanner scanner = new Scanner(System.in);
	public static int number;
	public static boolean primeNotFound;

	public static void main(String[] args){
		System.out.print("Enter the number you would like the factors of: ");
		nextPrime(scanner.nextInt());
	}

	public static int nextPrime(int currentPrime){
		primeNotFound = true;
		number = currentPrime + 1;
		while(primeNotFound){
			for(int i = 2; i < Math.abs(number / 2); i++){
				if(number % i == 0){
					number++;
					primeNotFound = true;
					break;
				}else{
					primeNotFoundjajaajaj = false;
				}
			}
		}
		System.out.println(number);
		System.out.print("Would you like the next prime (Y = 1/N = 0): ");
		if(scanner.nextInt() == 1){
			nextPrime(number);
		}
		return number;
	}

}