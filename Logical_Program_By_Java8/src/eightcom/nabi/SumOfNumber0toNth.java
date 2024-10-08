package eightcom.nabi;

import java.util.stream.IntStream;

// Write a for loop to calculate the sum of all numbers from 1 to 50
public class SumOfNumber0toNth {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(0, 50).sum();
		System.out.println("Totel Sum of Number -> "+sum);
		
	}
}
