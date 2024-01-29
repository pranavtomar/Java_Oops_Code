package arrays;

public class ArrayAssignment2 {
	
	public static double[] findDetails(double[] salary) {
	    //Implement your code here and change the return value accordingly
	    double averageSalary = 0.0;
		for(int i = 0; i < salary.length; ++i) {
	    	averageSalary += salary[i];
	    }
		averageSalary = averageSalary/salary.length;
		
		int countMax = 0, countMin = 0;
		for(int i = 0; i < salary.length; ++i) {
			if(averageSalary > salary[i]) {
				countMin++;
			}
			if(averageSalary < salary[i]) {
				countMax++;
			}
		}
		
		double[] arr = new double[3];
		arr[0] = averageSalary;
		arr[1] = countMax;
		arr[2] = countMin;
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
	}

}
