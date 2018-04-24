import java.util.Scanner;

public class main{

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.printf("Enter the number of fibbonaci numbers you want: ");
		fibonacciToN(scanner.nextInt());
		
	}

	public static void fibonacciToN(int n){
		System.out.println(1);
		
		int prevNum = 1;
		int currentNum = 1;

		for(int i = 0; i < n; i++){
			System.out.println(currentNum);
			int tempNum = prevNum;
			prevNum = currentNum;
			currentNum = tempNum + prevNum;
		}
	}

}