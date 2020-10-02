package class8;

public class Earth {
	static long numberOfPeopleOnEarth = 7000000000L;

	public static void registerBirth() {
		numberOfPeopleOnEarth++;
	}

	public void registerDeath() {
		numberOfPeopleOnEarth--;
	}

	public void display() {
		System.out.println("Number of People on Earth -> " + numberOfPeopleOnEarth);
	}
}
