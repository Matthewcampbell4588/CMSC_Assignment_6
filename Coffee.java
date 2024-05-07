
public class Coffee extends Beverage{
	private boolean extraShot;
	private boolean extraSyrup;
	private final double SHOT_UPCHARGE = 0.50;
	private final double SYRUP_UPCHARGE = 0.50;

	public Coffee(String name, Size s, boolean shotPlus, boolean syrupPlus) {
		super(name, Type.COFFEE, s);
		this.extraShot= shotPlus;
		this.extraSyrup = syrupPlus;
	}

	@Override
	public double calcPrice() {
		double price = super.getBASE_PRICE();
		if(super.getSize() == Size.MEDIUM)
			price += super.getSIZE_PRICE();
		else if(super.getSize() == Size.LARGE)
			price += (2 * super.getSIZE_PRICE());
		
		if(extraSyrup)
			price += SYRUP_UPCHARGE;
		if(extraShot)
			price += SHOT_UPCHARGE;
		return price;
	}

	public double getBasePrice() {
		return super.getBASE_PRICE();
	}

	public String getBevName() {
		return super.getBevName();
	}

	public Size getSize() {
		return super.getSize();
	}
	
	public Type getType() {
		return super.getType();
	}

	public boolean getExtraShot() {
		return extraShot;
	}

	public boolean getExtraSyrup() {
		return extraSyrup;
	}

	@Override
	public String toString() {
		return super.toString() + ", extraShot=" + extraShot + ", extraSyrup=" + extraSyrup + ", price=" + calcPrice();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return extraShot == other.extraShot && extraSyrup == other.extraSyrup;
	}
}
