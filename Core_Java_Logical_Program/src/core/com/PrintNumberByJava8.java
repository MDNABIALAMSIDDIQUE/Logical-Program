package core.com;

import java.util.stream.IntStream;

//Write a for loop to print numbers from 1 to 100.

public class PrintNumberByJava8 {
	public static void main(String[] args) {
		System.out.println("JAVA 8 ");
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
	}
}
