package class7;

public class Person {

	// Method overloading, Compile time polymorphism
	// Method overriding, Run time polymorphism

	public void eat(Chocolate c) {
		eatChocolate(c);
	}

	public void eat(Apple a) {
		eatApple(a);
	}

	public void eat(Grape g) {
		eatGrape(g);
	}

	public void eatChocolate(Chocolate c) {
		System.out.println("Eating chocolate");
	}

	public void eatApple(Apple a) {
		System.out.println("Eat Apple");
	}

	public void eatGrape(Grape g) {
		System.out.println("Eating grape");
	}

	public static void main(String args[]) {
		Person yalan = new Person();
		yalan.eatApple(new Apple());
		yalan.eatGrape(new Grape());

		yalan.eat(new Apple());
		yalan.eat(new Chocolate());
	}
}

class Chocolate {

}
