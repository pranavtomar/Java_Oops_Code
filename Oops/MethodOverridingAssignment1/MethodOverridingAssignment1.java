package MethodOverridingAssignment1;

class Faculty{
    //Implement your code here
	private String name;
	private float basicSalary;
	private float bonusPercentage = 4f;
	private float carAllowancePercentage = 2.5f;
	
	public Faculty(String name, float basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public double calculateSalary() {
		double totalSalary = this.basicSalary + (this.bonusPercentage/100.0f)*this.basicSalary  + (this.carAllowancePercentage/100.0f)*this.basicSalary;
		return totalSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getBonusPercentage() {
		return bonusPercentage;
	}
	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}
	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
}

class OfficeStaff extends Faculty{
    //Implement your code here
	private String designation;

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
	
	public double calculateSalary() {
		double additionalPay = 0.0;
		if(this.designation.equals("Accountant")) {
			additionalPay = 10000.0;
		}else if(this.designation.equals("Clerk")) {
			additionalPay = 7000.0;
		}else if(this.designation.equals("Peon")) {
			additionalPay = 4500.0;
		}else {
			additionalPay = 0.0;
		}	
		double salary = super.calculateSalary() + additionalPay;
		return salary;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

class Teacher extends Faculty{
    //Implement your code here
	private String qualification;

	public String getQualification() {
		return qualification;
	}

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}

	public double calculateSalary() {
		double additionalPay = 0.0;
		if(this.qualification.equals("Doctoral")) {
			additionalPay = 20000.0;
		}else if(this.qualification.equals("Masters")) {
			additionalPay = 18000.0;
		}else if(this.qualification.equals("Bachelors")) {
			additionalPay = 15500.0;
		}else if(this.qualification.equals("Associate")){
			additionalPay = 10000.0;
		}else {
			additionalPay = 0.0;
		}
		double salary = super.calculateSalary() + additionalPay;
		return salary;
	}
	
}

public class MethodOverridingAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}

}
