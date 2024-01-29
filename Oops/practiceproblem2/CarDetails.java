package practiceproblem2;

public class CarDetails {
	private static String[] carTypesArr = {"Hatch-back","Sedan","SUV"};
	private static int[] perDayRentsArr = {3500,5000,6000};
	
	//To_Trainee
	public static int identifyPerDayRent(String carType) {
		int rentPerDay = 0;
		int c = 0;
		for(int i = 0; i < carTypesArr.length; i++) {
			if(carType.equalsIgnoreCase(carTypesArr[i])) {
				c++;
				rentPerDay = perDayRentsArr[i];
			}
		}
		if(c == 0) {
			rentPerDay = -1;
		}
		return rentPerDay;
	}
}
