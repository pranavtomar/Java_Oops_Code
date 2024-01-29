package encapsulationExercise;

public class Employee {
	
	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;
	
	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setJoblevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	public int getJobLevel() {
		return jobLevel;
	}
}
