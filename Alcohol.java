
public class Alcohol extends Beverage {
	private boolean isWeekend;
	private final double WEEKEND_UPCHARGE = 0.60;

	public Alcohol(String name, Size size, boolean isWeekend) {
		super(name, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}

	public boolean isWeekend() {
		return isWeekend;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alcohol other = (Alcohol) obj;
		return isWeekend == other.isWeekend;
	}

	public void setIsWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	public double getBasePrice() {
		return super.getBASE_PRICE();
	}

	@Override
	public String toString() {
		String str = "Alcohol Name: " + this.getBevName() + "\n";
		str +="Size: "+ this.getSize() + "\n";
		str +="Served on Weekends: "+ this.isWeekend + "\n";
		str +="Price: " + this.calcPrice() + "\n";
		return str;
	}

	@Override
	public double calcPrice() {
		double price = super.getBASE_PRICE();
		if(super.getSize() == Size.MEDIUM)
			price += super.getSIZE_PRICE();
		else if(super.getSize() == Size.LARGE)
			price += (2 * super.getSIZE_PRICE());
		
		if(isWeekend)
			price += WEEKEND_UPCHARGE;
		
		return price;
	}
}
