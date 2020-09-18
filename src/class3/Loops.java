package class3;

public class Loops {

	public static void main(String[] args) {
		Kid reesha = new Kid();
		// reesha.tellAllNumbers(10);
		// reesha.tellAllNumbersWithoutLoop(6);
		// reesha.tellMultiplesOfThree(21);
		// reesha.tellMultiplesOfFiveUptoTwenty(30);
		Parent siva = new Parent();
		//siva.giveAssignmentToAllKidsToTellNumbers(10);
		reesha.displayNumberPyramid(10);

	}

}

class Parent {
	Kid[] kids = new Kid[] { new Kid(), new Kid(), new Kid() };

	void giveAssignmentToAllKidsToTellNumbers(int n) {
		for (Kid k : kids) {
			k.tellAllNumbers(n);
			System.out.println("-------");
		}
	}
}

class Kid {

	void tellAllNumbers(int end) {
		int i = 1;
		for (; i < end; i++) {
			System.out.println(i);
		}
	}

	void displayNumberPyramid(int end) {
		for (int i = 1; i < end; i++) {
			for (int j = 1; j <= i ;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	void tellMultiplesOfFiveUptoTwenty(int end) {
		for (int i = 1; i <= end; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			if (i == 20) {
				break;
			}
		}
	}

	void tellMultiplesOfThree(int end) {
		int start = 0;
		while (start < end) {
			start = start + 1;
			if (start % 3 == 0) {
				System.out.println(start);
			} else {
				continue;
			}
			System.out.println("Rest of the logic");
		}
	}

	void tellAllNumbersWithoutLoop(int end) {
		int start = 1;
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}
		if (start < end) {
			System.out.println(start);
			start = start + 1;
		}

	}
}
