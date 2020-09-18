package class3;

public class Strings {

	public static void main(String[] args) {
		String yating = "Yating";// String is a primitive data type
		String a = "Yating";
		String b = new String("Yating");
		String ruweiyu = new String(new char[] { 'r', 'u', 'w', 'e', 'i', 'y', 'u' });
		String fang = new String("Fang");// String is a class

		int i = 10;// int is a primitive data type
		Kid syra = new Kid();// Kid is a class
		Kid reesha = new Kid();

		System.out.println(yating);
		System.out.println(fang);

		int j = 11;

		if (i == j) {
			System.out.println("I and J are Equal");
		} else {
			System.out.println("I and J are Not Equal");
		}
		if (syra == reesha) {
			System.out.println("Two kids are same");
		} else {
			System.out.println("Two kids are not same");
		}

		if (yating == b) {
			System.out.println("Same strings");
		} else {
			System.out.println("Not same strings");
		}
		if (yating.equals(b)) {
			System.out.println("Same content");
		}
		//Strings are immutable
		String Shen = "Shen";
		System.out.println(Shen.replace('S', 'T'));
		System.out.println(Shen);
		String aa = "SHEN";
		String bb = "shen";
		System.out.println(bb.toUpperCase() == aa);
		String x = "Sh" + "en";
		String y = "Shen";
		String z = new String("Shen");

		System.out.println(Shen == x);

		boolean bbbb = "Siva".startsWith("Si");
		"Siva Dosapati".contains("Siva");

		boolean xyz = Shen.equals(x);// true

	}

}
