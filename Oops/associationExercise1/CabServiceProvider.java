package associationExercise1;
import java.lang.Math;
public class CabServiceProvider {
	
	private String cabServiceName;
	private int totalCabs;
	
	public CabServiceProvider(String cabServiceName, int totalCabs){
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	
	public double calculateRewardPrice(Driver driver) {
		double bonus = 0.0;
		if(this.getCabServiceName().equals("Halo")) {
			if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<=5) {
				bonus= driver.getAverageRating()*10;
			}else if(driver.getAverageRating()>=4.0 && driver.getAverageRating()<=4.5) {
				bonus= driver.getAverageRating()*5;
			}else {
				bonus=0.0;
			}
		}else if(this.getCabServiceName().equals("Aber")) {
			if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<=5) {
				bonus= driver.getAverageRating()*8;
			}else if(driver.getAverageRating()>=4.0 && driver.getAverageRating()<=4.5) {
				bonus= driver.getAverageRating()*3;
			}else {
				bonus=0.0;
			}
		}else {
			bonus=0;
		}
		return Math.round(bonus*100.0)/100.0;
	}
	
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	
	
}
