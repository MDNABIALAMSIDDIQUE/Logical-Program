package core.com.ReverseNumbers.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseNumbersBy2WayJava8 {
	public static void main(String[] args) {
		List<Integer> number = IntStream.range(1, 101) //Create a stream of numbers from 1 to 100
				.boxed() //// Convert int to Integer
				.collect(Collectors.toList()); // Collect to a List
		Collections.reverse(number); // Reverse the list
		number.forEach(System.out::println); // Print each number
	}
}