package junit.Uber;

public class Uber {
	
	private String driverName;
	private String carModel;
	private static double fareRate;
	private long startTime;
	private double surgeMultiplier;

	public Uber(String driverName, String carModel) {
		this.driverName = driverName;
		this.carModel = carModel;
		this.surgeMultiplier = 1;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public static double getFareRate() {
		return fareRate;
	}

	public static void setFareRate(double fareRate) {
		Uber.fareRate = fareRate;
	}
	
	public double setdownPassenger() {
		long time = System.currentTimeMillis() - startTime;
		return surgeMultiplier * fareRate * ((double) time / 1000);
	}
	
	public void pickupPassenger() {
		this.startTime = System.currentTimeMillis();
	}
	
	public double getSurgeMultiplier() {
		return surgeMultiplier;
	}

	public void setSurgeMultiplier(double surgeMultiplier) {
		this.surgeMultiplier = surgeMultiplier;
	}
}
