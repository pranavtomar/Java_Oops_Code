package checkerJavaKnowledge;

class Employee2{
	public int employeeId;
	private double basicSalary;
	private double totalSalary;
	
	public Employee2(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double getTotalSalary() {
		return totalSalary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public double calculateTotalSalary(int bonusPercentage) {
		this.totalSalary = this.basicSalary*(1+(double)bonusPercentage/100);
		return totalSalary;
	}
	
}

public class Checker6 {

	public static void main(String[] args) {
		
		Employee2 employee = new Employee2(2150);
		employee.employeeId = 101;
		employee.calculateTotalSalary(8);
		System.out.println("Employee Id: "+employee.getEmployeeId()+", Total salary: "+employee.getTotalSalary());
		
	}

}
