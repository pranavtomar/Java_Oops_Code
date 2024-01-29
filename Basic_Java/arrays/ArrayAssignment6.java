package arrays;

public class ArrayAssignment6 {
	
	public static int findTotalCount(int[] numbers) {
		int count = 0;
		for(int i = 0; i < numbers.length; ++i) {
			for(int j = i + 1; j < numbers.length; ++i) {
				if(numbers[i] == numbers[j]) {
					count++;
				}
				break;
			}
		}
        return count;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
	}

}
