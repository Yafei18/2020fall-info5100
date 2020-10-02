package class7;

abstract class Fruit {
	private double price;
	private boolean juicy;

	public double getPrice() {
		return price;
	}

	public Fruit() {
		price = 0;
		System.out.println("Default constructor");
	}

	public Fruit(double price) {
		this.price = price;
		System.out.println("Constructor with Price -> " + price);
	}

	public Fruit(double price, boolean juicy) {
		this.price = price;
		this.juicy = juicy;
		System.out.println("Constructor with Price and Juicy -> " + price + " -> " + juicy);
	}

	public boolean isJuicy() {
		return juicy;
	}

	public void setJuicy(boolean b) {
		this.juicy = b;
	}

	public double getDiscount() {
		System.out.println("Discount in " + getName() + " is 0");
		return 0;
	}

	public String getName() {
		return "Fruit";
	}

}

class Apple extends Fruit {

	@Override
	public String getName() {
		return "Apple";
	}

	Apple() {
		super(0.25d);
	}

	Apple(double price) {
		super(price);
		System.out.println("Apple constructor");
	}

	public double getDiscount() {

		if (super.getPrice() > 0.25d) {
			System.out.println("Apple whose price is greater than 25 cents has a discount");
			return 0.1d;
		}
		return super.getDiscount();
	}

}

class Grape extends Fruit {
	Grape() {
		super(0.10d);
	}

	@Override
	public String getName() {
		return "Grape";
	}
}
