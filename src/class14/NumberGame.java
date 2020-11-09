package class14;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// EntryManager em = new EntryManagerImpl();
		EntryManager em = new FileEntryManagerImpl();
		playGame(em);

	}

	private static void playGame(EntryManager em) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("What do you want to do (ADD|ASK|CHANGE|QUIT)");
			String line = scanner.nextLine();
			if (line.equals("QUIT")) {
				break;
			}
			if (line.equals("ADD")) {
				System.out
						.println("Please Enter the Name and Number that you are interested in with a comma in between");
				String s = scanner.nextLine();
				String tokens[] = s.split("\\,");
				em.addEntry(tokens[0], Integer.parseInt(tokens[1]));
				continue;
			}
			if (line.equals("ASK")) {
				System.out.println("Please enter the Name for whom you need the number");
				String s = scanner.nextLine();
				Integer n = em.getNumber(s);
				System.out.println(s + " is interested in the number -> " + n);
				continue;

			}
		}
		scanner.close();

	}

}

class Entry {
	String name;
	int number;
}

interface EntryManager {
	void addEntry(String name, int number);

	Integer getNumber(String name);

	void changeNumber(String name, int oldNumber, int newNumber);
}

class EntryManagerImpl implements EntryManager {

	private Map<String, Integer> numberMap = new HashMap<String, Integer>();

	@Override
	public void addEntry(String name, int number) {
		numberMap.put(name, number);

	}

	@Override
	public Integer getNumber(String name) {

		return numberMap.get(name);
	}

	@Override
	public void changeNumber(String name, int oldNumber, int newNumber) {
		int existingNumber = numberMap.get(name);
		if (oldNumber != existingNumber) {
			throw new RuntimeException(
					oldNumber + " for " + name + " is not the same as supplied number -> " + existingNumber);
		}
		numberMap.put(name, newNumber);

	}

}

class FileEntryManagerImpl extends EntryManagerImpl {

	private File file = new File("numbers.txt");

	public FileEntryManagerImpl() {
		loadDataFromFileIntoMemory();
	}

	private void loadDataFromFileIntoMemory() {
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String t[] = line.split("\\,");
				super.addEntry(t[0], Integer.parseInt(t[1]));
			}
			scanner.close();
		} catch (Exception e) {
		}

	}

	@Override
	public void addEntry(String name, int number) {
		super.addEntry(name, number);
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(file, true), true);
			writer.println(name + "," + number);
			writer.close();
		} catch (Exception e) {

		}

	}

}
