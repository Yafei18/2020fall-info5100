package class17;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Java5And8Snippets {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList strings = new ArrayList();
		strings.add(new Integer(10));

		@SuppressWarnings("unused")
		ArrayList<String> stringList = new ArrayList<String>();
		// stringList.add(new Integer(10));

		// System.out.println(new Java5And8Snippets().toString());

		List<String> stringNames = Arrays.asList("Siva", "Yaqi", "Jason", "Deepikas", "Anjali", "X", "AA", "B", "CCC",
				"DDDDD", "EEEEEEE", "fff");
		System.out.println(stringNames);
		Collections.sort(stringNames);
		System.out.println(stringNames);
		Collections.sort(stringNames, new Comparator<String>() {
			public int compare(String a, String b) {
				return Integer.compare(a.length(), b.length());
			};
		});

		System.out.println(stringNames);
		// Collections.sort(stringNames, (a, b) -> {Integer.compare(a.length(),
		// b.length())});

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				// System.out.println("Number -> " + i);
			}
		};

		new Thread(r).start();

		Comparator<String> lengthComparator = Comparator.comparing(String::length);
		Collections.sort(stringNames, lengthComparator);
		System.out.println(stringNames);
		stringNames.forEach((a) -> {
			System.out.println(a.toUpperCase());
		});
		stringNames.sort(Comparator.comparing(String::length));

		List<String> selectedStrings = findSelectedString(stringNames, 3, 5);
		System.out.println(selectedStrings);
		Stream<String> output = stringNames.stream().filter((a) -> {
			return a.length() > 3;
		}).limit(5);
		System.out.println("-------");
		output.forEach(System.out::println);

	}

	private static List<String> findSelectedString(List<String> stringNames, int expectedLength, int maximumNumber) {
		ArrayList<String> temp = new ArrayList<String>();
		for (String s : stringNames) {
			if (temp.size() == maximumNumber) {
				return temp;
			}
			int x = s.length();
			if (x > expectedLength) {
				temp.add(s);
			}
		}
		return temp;
	}

	@Override
	public String toString() {
		return "java 5 and 8 snippets";
	}

}
