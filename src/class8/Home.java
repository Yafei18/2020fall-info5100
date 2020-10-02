package class8;

public class Home {

	public static void main(String[] args) {
		Child syra = new Child();
		Dad cva = new Dad();
		Mom radhika = new Mom();
		syra.play(cva);
		syra.play(radhika);
		syra.play(new Toy());

		Child rishaan = new Child();
		syra.play(rishaan);
		rishaan.play(syra);

		radhika.arrangeLunch(cva);
		radhika.arrangeLunch(new Friend());

		//Maths m = new Maths();
		System.out.println(Maths.sum(10, 15));
		System.out.println(Maths.sum(15, 20));

	}

}

interface LunchHelper {
	void arrangePlatesOnDiningTable();
}

interface ChildPlayer {
	public void playWithChild();

	// Java 8 and above
	public default void cleanup() {
		System.out.println("Default cleanup");
	}
}

class Child implements ChildPlayer {

	public void play(ChildPlayer cp) {
		System.out.println("Playing with a child player -> " + cp);
		cp.playWithChild();
	}

	@Override
	public void playWithChild() {
		System.out.println("A child is playing with another child");

	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub

	}

}

class Dad implements ChildPlayer, LunchHelper {
	public void playWithChild() {
		System.out.println("Dad is playing with Child");
	}

	@Override
	public void arrangePlatesOnDiningTable() {
		System.out.println("Dad arranges plates on table");

	}

	public void giveBathToKids() {

	}

	public void getGroceries() {

	}
}

class Mom implements ChildPlayer {
	@Override
	public void playWithChild() {
		System.out.println("Mom is playing with Child");
	}

	public void arrangeLunch(LunchHelper lh) {
		lh.arrangePlatesOnDiningTable();
	}

	public void buyGroceries(Dad dad) {
		dad.getGroceries();
	}

}

class Toy implements ChildPlayer {

	@Override
	public void playWithChild() {
		// TODO Auto-generated method stub

	}

}

class Friend implements LunchHelper {

	@Override
	public void arrangePlatesOnDiningTable() {
		System.out.println("Friend arranges plates");

	}

}

class MomHelper implements LunchHelper {

	@Override
	public void arrangePlatesOnDiningTable() {
		System.out.println("Mom Helper arranges plates");

	}

}
