package class15.streams;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadFromConsoleAndWriteIntoFile {

	public static void main(String[] args) throws Exception {
		String f = "some_output.data";
		FileOutputStream fos = new FileOutputStream(f);
		PrintStream ps = new PrintStream(fos);
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter a line. For exiting, please enter quit");
			String line = s.nextLine();
			if (line.equalsIgnoreCase("QUIT")) {
				break;
			}
			String upperLine = line.toUpperCase();
			// byte b[] = upperLine.getBytes();
			// fos.write(b);
			// fos.write("\n".getBytes());
			ps.println(upperLine);
		}
		fos.close();

	}

}
