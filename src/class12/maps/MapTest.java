package class12.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Collection<Student> studentsCollection = new ArrayList<Student>();
		studentsCollection.add(new Student(100, "Alexis"));
		studentsCollection.add(new Student(101, "Tina"));
		studentsCollection.add(new Student(102, "Jessi"));
		studentsCollection.add(new Student(103, "Zhize"));

		findStudentWithRollNumber(103, studentsCollection);
		findStudentWithRollNumber(110, studentsCollection);

		Map<Integer, String> studentsMap = new HashMap<Integer, String>();

		for (Student s : studentsCollection) {
			studentsMap.put(s.roll, s.name);
		}
		System.out.println("Access using map...");

		System.out.println(studentsMap.get(103));
		System.out.println(studentsMap.get(110));

		Map<Integer, String> numbersMap = new LinkedHashMap<Integer, String>();
		for (int i = 0; i < 100; i++) {
			numbersMap.put(i, "Siva : " + i);
		}
		System.out.println("Numbers map...");
		for (Map.Entry<Integer, String> entry : numbersMap.entrySet()) {

			Integer key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " -> " + value);
		}

		Map<String, String> firstNameLastNameMap = new HashMap<String, String>();

		makeNamesMap(firstNameLastNameMap);

		printMap(firstNameLastNameMap);

		firstNameLastNameMap = new LinkedHashMap<String, String>();

		makeNamesMap(firstNameLastNameMap);

		printMap(firstNameLastNameMap);

		firstNameLastNameMap = new TreeMap<String, String>();

		makeNamesMap(firstNameLastNameMap);

		printMap(firstNameLastNameMap);
	}

	private static void printMap(Map<String, String> firstNameLastNameMap) {
		System.out.println("Map -> " + firstNameLastNameMap.getClass().getName());
		for (String key : firstNameLastNameMap.keySet()) {
			System.out.println(key + " -> " + firstNameLastNameMap.get(key));
		}
		System.out.println("----");

	}

	private static void makeNamesMap(Map<String, String> firstNameLastNameMap) {
		firstNameLastNameMap.put("Alexis", "Babb");
		firstNameLastNameMap.put("Yaqi", "Wang");
		firstNameLastNameMap.put("Tina", "Sun");
		firstNameLastNameMap.put("Xinchen", "Hu");
		firstNameLastNameMap.put("Zhije", "Li");
		firstNameLastNameMap.put("Alexis", "Johnson");

	}

	private static void findStudentWithRollNumber(int rollNumber, Collection<Student> students) {
		for (Student s : students) {
			if (s.roll == rollNumber) {
				System.out.println("Student with roll -> " + rollNumber + " -> found. Their name is -> " + s.name);
				return;
			}
		}
		System.out.println("Student with roll -> " + rollNumber + " is not found");
	}

}

class Student {
	int roll;
	String name;

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
}
