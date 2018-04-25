import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*

Have the user enter a number and find all Prime Factors (if there are any) and display them.

*/

public class main{

	public static Scanner scanner = new Scanner(System.in);
	public static List<Integer> primeNumbers = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 
																					89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 
																					181, 191, 193, 197, 199));

	public static void main(String[] args){
		System.out.print("Enter the number you would like the factors of: ");
		primeFactors(scanner.nextInt());
	}

	public static int primeFactors(int n){
		if(primeNumbers.contains(n)){
			System.out.println(n);
			return n;
		}
		for(int i = 0; i < primeNumbers.size(); i++){
			if(n % primeNumbers.get(i) == 0){
				System.out.println(primeNumbers.get(i));
				primeFactors(n / primeNumbers.get(i));
				return primeNumbers.get(i);
			}
		}
		return 0;
	}

}