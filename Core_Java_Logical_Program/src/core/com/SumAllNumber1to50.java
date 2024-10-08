package core.com;

//Write a for loop to calculate the sum of all numbers from 1 to 50
public class SumAllNumber1to50 {
	
	public static void main(String[] args) {
		int sum =0;
		for (int i = 0; i <= 50; i++) {
			sum += i;	
		}
		System.out.println("Sum of Number -> "+sum );
	}

}
