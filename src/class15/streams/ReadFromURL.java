package class15.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ReadFromURL {

	public static void main(String[] args) throws Exception {
		String url = "https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html";
		URL u = new URL(url);
		// readFromInputStreamDirectly(u.openStream());
		// readFromScanner(u.openStream());
		findOccurenceOfWord("this", u.openStream(), " ");
		File file = new File("/Users/sivad/git/2020fall-info5100/src/class14/NumberGame.java");
		findOccurenceOfWord("System", new FileInputStream(file), ".");

	}

	private static void findOccurenceOfWord(String string, InputStream openStream, String tok) {
		Scanner s = new Scanner(openStream);
		int count = 0;
		while (s.hasNext()) {
			String x = s.nextLine();
			String token[] = x.split("\\" + tok);
			for (String t : token) {
				if (t.trim().equalsIgnoreCase(string)) {
					count++;
				}
			}
		}
		s.close();
		System.out.println(string + " has occured " + count + " times");

	}

	private static void readFromScanner(InputStream is) throws Exception {
		Scanner scanner = new Scanner(is);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();

	}

	private static void readFromInputStreamDirectly(InputStream is) throws IOException {
		while (true) {
			int x = is.read();
			if (x == -1)
				break;
			char c = (char) x;
			System.out.print(c);
		}
		is.close();
	}

}
