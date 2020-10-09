package class10.exceptions;

public class Street {

	public static void mainA(String args[]) throws Exception {
		Person p = new Person();
		try {
			p.walk();
		} finally {
			p.callHome();
		}
	}

	public static void main(String args[]) throws Exception {
		Professor p = new Professor();
		try {
			p.teach(0, 10);
		} catch (KidCryingException e) {
			int x = e.getIteration();
			if (x < 8) {
				System.out.println("I will wait for 10 seconds");
				System.out.println("I will still teach because the class is not completely done -> " + e);
				Thread.sleep(10000);
				p.teach(x, 10);
			} else {
				System.out.println("Problem with teaching class");
			}
		}
		System.out.println("Class is done");
	}

	public static void mainOld(String[] args) {
		Person p = new Person();
		boolean happyState = false;
		try {
			p.walk();
			System.out.println("Done");
			happyState = true;
		} catch (RainException e) {
			System.out.println("Person can't walk as it's raining");
			p.stopWalking();
		} catch (NotFeelingWellException nfe) {
			p.callDoctor();
		} catch (Exception e) {
			System.out.println("Stop walking as I encountered a problem -> " + e);
			p.stopWalking();
		} finally {
			if (happyState == false) {
				p.callHomeAndMentionThatSomethingIsNotRight();
			} else {
				p.callHome();
			}
		}

	}

}

class Human {
	int getRandomNumber(int x) {
		return (int) (Math.random() * x);
	}
}

class Person extends Human {
	void callHome() {
		System.out.println("Call Home");
	}

	void callHomeAndMentionThatSomethingIsNotRight() {
		System.out.println("Call Home tell that there is a problem");
	}

	void callDoctor() {
		System.out.println("Calling Doctor");
	}

	void walk() throws RainException, NotFeelingWellException {
		for (int i = 0; i < 10; i++) {
			int r = getRandomNumber(10);
			if (r == 9) {
				throw new HeartAttackException();
			}
			if (r == i) {
				throw new RainException();
			}
			if (r == 7) {
				throw new NotFeelingWellException();
			}
			System.out.println(i + ".Walking");
		}
	}

	void stopWalking() {
		System.out.println("Stop Walking");
	}

}

class KidCryingException extends RuntimeException {
	private int iteration;

	public KidCryingException(int iteration) {
		this.iteration = iteration;
	}

	public int getIteration() {
		return iteration;
	}
}

class Professor extends Person {
	void teach(int start, int end) {
		for (int i = start; i < end; i++) {
			int r = getRandomNumber(10);
			if (r == i) {
				throw new KidCryingException(i);
			}
			System.out.println(i + ".Teaching");
		}
	}
}

class HeartAttackException extends RuntimeException {

}

class NotFeelingWellException extends Exception {

}

class RainException extends Exception {

}
