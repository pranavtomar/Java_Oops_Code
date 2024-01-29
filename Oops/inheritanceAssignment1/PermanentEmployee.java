package inheritanceAssignment1;

public class PermanentEmployee extends Employee{
	
	
	private double basicPay;
	private double hra;
	private float experience;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public float getExperiene() {
		return experience;
	}


	public void setExperiene(float experience) {
		this.experience = experience;
	}


	public void calculateMonthlySalary() {
		// TODO Auto-generated method stub
		double variableComponent = 0.0;
		if(this.getExperiene() < 3) {
			variableComponent = 0.0;
		}else if(this.getExperiene() >= 3 && this.getExperiene() < 5) {
			variableComponent = basicPay*(5/100.0);
		}else if(this.getExperiene() >= 5 && this.getExperiene() < 10) {
			variableComponent = basicPay*(7/100.0);
		}else {
			variableComponent = basicPay*(12/100.0);
		}
		this.setSalary(this.basicPay+this.hra+variableComponent);
	}
	
	public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperiene();
    }
	
}
