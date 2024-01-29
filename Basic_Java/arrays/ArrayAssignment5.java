package arrays;

public class ArrayAssignment5 {
	
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		// Implement your code here
		int j = 0;
		if(num1 > 0 && num2 > 0) {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i =i+5) {
					if(i%3==0 && i%5==0) {
						numbers[j] = i;
						j++;
					}
				}
			}
		}else if(num1 < 0 && num2 > 0) {
			num1 = 0;
			if(num1 < num2) {
				for(int i = num1; i <= num2; i =i+5) {
					if(i%3==0 && i%5==0) {
						numbers[j] = i;
						j++;
					}
				}
			}
		}else if(num1 < 0 && num2 < 0){
			return numbers;
		}
		return numbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = -20;
		int num2 = -4;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}
	}

}
