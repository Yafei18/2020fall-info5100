package class6;

abstract public class Animal {
	public void breathe() {
		System.out.println("Animal can breathe");
	}

	public void eat() {

	}

	public void drink() {

	}

	public void sleep() {

	}

	public void die() {

	}

	public static void main(String args[]) {
		//Animal animal = new Animal();
		Animal animal = new Mammal();
		animal.breathe();
		animal.sleep();
		animal.eat();

		Mammal m = new Mammal();
		m.breathe();
		m.eat();
		m.sleep();

		Reptile r = new Reptile();
		r.eat();
		r.sleep();

		Dog dog = new Dog();
		dog.feedChildren();
		dog.bark();
	}
}

class Mammal extends Animal {
	public void feedChildren() {
		System.out.println("Feed children");
	}

}

class Reptile extends Animal {

}

class Dog extends Mammal {

	public void bark() {
		System.out.println("Dog is barking");
	}

}