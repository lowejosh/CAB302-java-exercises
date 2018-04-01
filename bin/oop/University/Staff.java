package oop.University;

public class Staff extends Academic {

	private int hours;
	
	public Staff(String name, int id, Title title) {
		super(name, id, title);
		hours  = 0;
	}
	
	@Override
	public double getWeeklyPay() {
		if(getTitle() == Title.TUTOR) {
			return 40.0 * hours;
		} else {
			return 80000.0 / 52.0;
		}
	}

	@Override
	public String toString() {
		return "Staff " + this.getID() + " works as a " + this.getTitle().toString();
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}
