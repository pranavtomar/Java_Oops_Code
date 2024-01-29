package methodoverloadingexercise1;
import java.lang.Math;

public class Point {
	
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance() {
		// calculate distance from origin (0,0)
		double distance = Math.sqrt(Math.pow(this.xCoordinate, 2)+ Math.pow(this.yCoordinate, 2));
		return Math.round(distance*100.0)/100.0;
	}
	
	public double calculateDistance(Point point) {
		double distance = Math.sqrt(Math.pow(point.getxCoordinate()-this.xCoordinate, 2)+ Math.pow(point.getyCoordinate()-this.yCoordinate, 2));
		return Math.round(distance*100.0)/100.0;
	}
	
	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
}
