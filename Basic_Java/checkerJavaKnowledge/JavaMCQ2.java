package checkerJavaKnowledge;

abstract class Faculty { 

    private String facultyName; 
    private double basicSalary; 
    private double totalSalary; 
    public Faculty(String facultyName, int basicSalary) { 
        this.facultyName = facultyName; 
        this.basicSalary = basicSalary; 
    } 
    public String getFacultyName() { 
        return this.facultyName; 
    } 
    public double getTotalSalary() { 
        return this.totalSalary; 
    } 
    public void setTotalSalary(double totalSalary) { 
        this.totalSalary = totalSalary; 
    } 
    public double calcualteTotalAllowance() { 
        double totalAllowance = this.basicSalary * 16.0 / 100.0; 
        return totalAllowance; 
    } 
    public abstract void calculateTotalSalary(); 
} 

class NonTeachingFaculty extends Faculty { 
    private int noOfHours; 
    public NonTeachingFaculty(String facultyName, int basicSalary, int noOfHours) { 
        super(facultyName, basicSalary); 
        this.noOfHours = noOfHours; 
    } 
    @Override 
    public void calculateTotalSalary() { 
        double extraPay = this.noOfHours * 350.0; 
        this.setTotalSalary(this.calcualteTotalAllowance() + extraPay); 
    } 
} 
public class JavaMCQ2 { 
    public static void main(String[] args) { 
    Faculty faculty1 = new NonTeachingFaculty("Stella", 8000, 12); 
    faculty1.calculateTotalSalary(); 
    System.out.println(faculty1.getFacultyName() + " draws a salary: " + faculty1.getTotalSalary()); 
   } 
} 