package class8;

public class University {

	public static void main(String[] args) {
		Earth a = new Earth();
		Earth b = new Earth();
		a.display();
		b.display();
		a.registerBirth();
		Earth.registerBirth();
		// b.registerBirth();
		a.display();
		b.display();
		System.out.println("------");
		a.display();
		a.registerDeath();
		a.display();
	}

}
