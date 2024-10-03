package core.com;
//Write a for loop to print numbers from 1 to 100.
public class PrintNumbers_Using_Recursion {
	public static void main(String[] args) {
		System.out.println("Using Recursion");
		printNumber(1);
	}

	private static void printNumber(int n) {
		if (n<=100) {
			System.out.println(n);
			printNumber(n+1);
		}
		
	}
}
