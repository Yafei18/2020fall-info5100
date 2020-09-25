package class6;

public class MultipleValues {

	public static void main(String[] args) {
		int counter1 = 10;
		int counter2 = 20;
		int counter3 = 30;
		Counters counters = new Counters();
		CounterCollection cc = counters.incrementCounters(counter1, counter2, counter3);
		System.out.println(cc.counter1);
		System.out.println(cc.counter2);
		System.out.println(cc.counter3);

		int result[] = counters.incrementCountersAsArray(counter1, counter2, counter3);

		System.out.println(result[0]);
		// System.out.println(counters.reverseCharacters("Anjali"));

		String string = "Wang";
		char c[] = string.toCharArray();
		String newString = "";
		for (int i = c.length - 1; i >= 0; i--) {
			newString = newString + c[i];
		}
		System.out.println(newString);

	}
}

class Counters {
	public CounterCollection incrementCounters(int counter1, int counter2, int counter3) {
		CounterCollection cc = new CounterCollection();
		cc.counter1 = counter1 + 1;
		cc.counter2 = counter2 + 1;
		cc.counter3 = counter3 + 1;
		return cc;
	}

	public int[] incrementCountersAsArray(int counter1, int counter2, int counter3) {
		int x[] = new int[3];
		x[0] = counter1 + 1;
		x[1] = counter2 + 1;
		x[2] = counter3 + 1;
		return x;
	}

	public String reverseCharacters(String string) {
		char c[] = string.toCharArray();
		String newString = "";
		for (int i = c.length - 1; i >= 0; i--) {
			newString = newString + c[i];
		}
		return newString;
	}
}

class CounterCollection {
	int counter1;
	int counter2;
	int counter3;
}
