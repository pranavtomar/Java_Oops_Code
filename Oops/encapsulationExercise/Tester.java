package encapsulationExercise;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
//		employee.employeeId = "C101";
//		employee.employeeName = "Steve";
//		employee.salary = 650;
//		employee.jobLevel = 4;
		
		employee.setEmployeeId("C101");
		employee.setEmployeeName("Steve");
		employee.setSalary(650);
		employee.setBonus(0);
		employee.setJoblevel(4);
		employee.calculateSalary();
		
		employee.getJobLevel();
		employee.getBonus();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());
		
	}

}
