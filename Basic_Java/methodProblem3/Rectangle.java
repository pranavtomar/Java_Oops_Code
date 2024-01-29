package methodProblem3;
import java.lang.Math;

public class Rectangle {
	
	public float length;
	public float width;
	
	public double calculateArea() {
		double area = Math.round(length * width * 100.0)/100.0;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = Math.round((2.0*length + 2.0*width)*100.0)/100.0;
		return perimeter;
	}
	
}
