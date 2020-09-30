package class7;

public class Home {
	public static void main(String args[]) {
		Apple a = new Apple();
		Grape g = new Grape();
		Apple aa = new Apple(0.5d);
		a.setJuicy(true);
		System.out.println(a.isJuicy());
		System.out.println("-----");
		System.out.println(a.getDiscount());
		System.out.println(aa.getDiscount());
		System.out.println("---");

		System.out.println(g.getDiscount());
		System.out.println(":::::::::::");
		Fruit x = new Apple();
		Fruit y = new Grape();
		System.out.println(x.getDiscount());
		System.out.println(y.getDiscount());

		System.out.println("((((((((((");
		x = new Grape();
		System.out.println(x.getDiscount());

		// aa.price = -10;
	}

}