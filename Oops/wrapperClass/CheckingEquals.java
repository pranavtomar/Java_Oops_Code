package wrapperClass;

public class CheckingEquals {

	public static void main(String[] args) {
		
		String numStr = "123";
		int numInt = Integer.parseInt(numStr);
		System.out.println("String to integer: "+numInt);
		
//		it will throw error
//		String numStr = "123.34";
//		int numInt = Integer.parseInt(numStr);
//		System.out.println("String to integer: "+numInt);
		
//		it will throw error
//		String numStr = "abc123";
//		int numInt = Integer.parseInt(numStr);
//		System.out.println("String to integer: "+numInt);
		
		String doubleStr = "123.34";
		double numDouble = Double.parseDouble(doubleStr);
		System.out.println("String to integer: "+numDouble);
		
		Integer phoneNo = 44281234;
//		Long phoneNoLong = phone
				
		System.out.println("Integer 5 as binary string: "+Integer.toBinaryString(5));
	}

}
