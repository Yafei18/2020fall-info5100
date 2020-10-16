package class11.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {

		// Using Numbers
		int[] numbersArray = new int[3];
		numbersArray[0] = 10;
		numbersArray[1] = 15;
		numbersArray[2] = 20;
		printArray(numbersArray);
		// addAnElementToArray(numbersArray, 3, 25);
		// numbersArray[3] = 25;
		printArray(numbersArray);

		// Using Collections
		Collection<Integer> numbers;// Java 5 - Generics
		numbers = new ArrayList<Integer>();
		numbers.add(new Integer(10));
		numbers.add(new Integer(15));
		numbers.add(new Integer(20));
		// numbers.add("Siva");
		printCollection(numbers);
		// Add a new number
		numbers.add(25);
		printCollection(numbers);

		int x = 10;
		int a;
		Integer y = new Integer(10);
		Integer z;
		a = x;
		z = y;

		Integer d = x;

		int c = y;

		System.out.println(d + " -> " + c);

	}

	private static void addAnElementToArray(int[] numbersArray, int index, int number) {
		if (numbersArray.length < index) {
			numbersArray[index] = number;
		} else {
			// numbersArray = expandArray(numbersArray);
			numbersArray[index] = number;
		}

	}

	private static void printArray(int[] numbersArray) {
		System.out.println("Array");
		for (int i : numbersArray) {
			System.out.println(i);
		}
		System.out.println("----");

	}

	private static void printCollection(Collection numbers) {
		System.out.println("Collection");
		for (Object o : numbers) {
			System.out.println(o);
		}
		System.out.println("------");

	}

}
