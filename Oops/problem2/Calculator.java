package problem2;

public class Calculator {
	
	public int num;
	
	public int sumOfDigits() {
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		return sum;
	}
	
}
