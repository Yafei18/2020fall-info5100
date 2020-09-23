package class5;

public class Human {

	String name = null;

	Human() {
		System.out.println("Human is created");
	}

	Human(String name) {
		System.out.println(name + " is created..");
		this.name = name;
	}

	protected void finalize() {
		System.out.println(name + " is destroyed");
	}

	Human(String firstName, String lastName) {
		System.out.println("Person with First Name[" + firstName + "] and Last Name[" + lastName + "] is born");
		name = firstName + " " + lastName;

	}

	Human(String firstName, String middleName, String lastName) {
		this(firstName + " " + middleName + " " + lastName);

	}

	void speak() {
		System.out.println(name + " is speaking");
	}

	public static void main(String args[]) {
		Human siva = new Human();
		siva.name = "Siva Dosapati";
		siva.speak();

		Lion lionInForest = new Lion();

		Human dinggan = new Human("Dinggan");

		Human yaqi = new Human("Yaqi Wang");

		Human jiWoong = new Human("Ji", "Woong");

		yaqi.speak();

		jiWoong.speak();

		Human cva = new Human("Siva", "Kumar", "Dosapati");
		cva.speak();

		Human professor = cva;

		new Human("Fangwen Ge");// .speak();
		new Human("Yating", "Chang");
		System.out.println("Done");

		dinggan = null;

		Runtime.getRuntime().gc();

		System.out.println("Done again");

	}

}

class Lion {

	void lion() {
		System.out.println("A Lion is born..");
	}

	void Loin() {

	}

}
