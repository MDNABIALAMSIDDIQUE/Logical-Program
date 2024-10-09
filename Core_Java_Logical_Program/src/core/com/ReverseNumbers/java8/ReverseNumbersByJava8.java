package core.com.ReverseNumbers.java8;

import java.util.stream.IntStream;

public class ReverseNumbersByJava8 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100)
		.map(i -> 101 -i)
		.forEach(System.out::println);
	}
}	
