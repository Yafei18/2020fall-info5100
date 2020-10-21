package class11.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {

		// workOnArrays();

		// Using Collections
		Collection<Integer> numbers;// Java 5 - Generics
		numbers = new ArrayList<Integer>();
		addElementsToCollection(numbers);
		// numbers.add("Siva");
		printCollection(numbers);
		// Add a new number
		numbers.add(25);
		printCollection(numbers);

		LinkedList<Integer> numbersLinkedList = new LinkedList<Integer>();
		addElementsToCollection(numbersLinkedList);
		printCollection(numbersLinkedList);
		numbersLinkedList.add(2, 35);
		printCollection(numbersLinkedList);

		numbers = new HashSet<Integer>();
		addElementsToCollection(numbers);
		printCollection(numbers);
		numbers.add(10);
		printCollection(numbers);

		numbers = new LinkedHashSet<Integer>();
		addElementsToCollection(numbers);
		printCollection(numbers);

		numbers = new TreeSet<Integer>();
		addElementsToCollection(numbers);
		printCollection(numbers);

		Stack<Integer> numbersStack = new Stack<Integer>();
		addElementsToCollection(numbersStack);
		printCollection(numbersStack);
		System.out.println(numbersStack.peek());
		System.out.println(numbersStack.peek());
		System.out.println(numbersStack.peek());
		System.out.println(numbersStack.pop());
		System.out.println(numbersStack.pop());

		// autoBoxing();

	}

	private static void workOnArrays() {
		// Using Numbers
		int[] numbersArray = new int[3];
		numbersArray[0] = 10;
		numbersArray[1] = 15;
		numbersArray[2] = 20;
		printArray(numbersArray);
		// addAnElementToArray(numbersArray, 3, 25);
		// numbersArray[3] = 25;
		printArray(numbersArray);
	}

	private static void autoBoxing() {
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

	private static void addElementsToCollection(Collection<Integer> numbers) {
		numbers.add(new Integer(10));
		numbers.add(new Integer(15));
		numbers.add(new Integer(20));
		numbers.add(new Integer(20));
		numbers.add(new Integer(12));
		numbers.add(new Integer(15));
		numbers.add(new Integer(18));

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
		System.out.println("Collection -> " + numbers.getClass().getName());
		for (Object o : numbers) {
			System.out.println(o);
		}
		System.out.println("------");

	}

}
