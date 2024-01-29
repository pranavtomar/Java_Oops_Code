package arrays;

public class ArrayAssignment3LeapYear {
	
	public static int[] findLeapYears(int year){
	       //Implement your code here and change the return value accordingly
			int[] leapYear = new int[15];
			int i = 0;
			while(i < 15) {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					leapYear[i] += year;
					i++;
				}
			year++;
			}
			return leapYear;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	}

}
