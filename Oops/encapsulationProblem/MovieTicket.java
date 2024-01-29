package encapsulationProblem;
import java.lang.Math;
public class MovieTicket {
	
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
	public MovieTicket(int movieId, int noOfSeats) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}
	
	public double calculateTotalAmount() {
		if(movieId == 111) {
			costPerTicket =7;
		}else if(movieId == 112) {
			costPerTicket =8;	
		}else if(movieId == 113) {
			costPerTicket = 8.5;
		}
		double amount = Math.round(noOfSeats*costPerTicket*(1+2/100)*10.0)/10.0;
		return amount;
	}
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
}
