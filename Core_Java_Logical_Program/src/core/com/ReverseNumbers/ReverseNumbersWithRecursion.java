package core.com.ReverseNumbers;

public class ReverseNumbersWithRecursion {
	public static void main(String[] args) {
		printNumber(100);
	}

	public static void printNumber(int i) {
		
		if (i<1) {
			return;
		}
		System.out.println(i);
		printNumber(i-1);
	}
}
