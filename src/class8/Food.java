package class8;

public abstract class Food {
	private double price;
	private double calories;

	Food() {

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void giveEnergy();

	public static void main(String args[]) {
		// Food f = new Food();
		Burger b = new Burger();
		b.giveEnergy();

		Salad s = new Salad();
		s.giveEnergy();

		Pizza p = new Pizza();
		p.giveEnergy();
	}
}

class Burger extends Food {

	@Override
	public void giveEnergy() {
		System.out.println("Burger gives a lot of energy with carbs");

	}

}

class Salad extends Food {

	@Override
	public void giveEnergy() {
		System.out.println("Salad gives a reasonable energy that doesn't have carbs");

	}

}

class Pizza extends Food {

	@Override
	public void giveEnergy() {
		System.out.println("Pizza gives a lot of energy as well");

	}

}

abstract class BBQ extends Food {

}

abstract class Meal extends Food {

	private boolean threeCourse = true;

	public boolean isThreeCourse() {
		return threeCourse;
	}
}
