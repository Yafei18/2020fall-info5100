package class15.streams;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileCount {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sivad/git/2020fall-info5100");
		FileLineCount fileLineCount = countFilesAndLines(".java", file);
		System.out.println(fileLineCount.numberOfFiles + " -> " + fileLineCount.numberOfLines);
	}

	private static FileLineCount countFilesAndLines(String extension, File file) throws Exception {
		FileLineCount flc = new FileLineCount();
		if (file.isFile()) {
			String path = file.getAbsolutePath();
			if (path.endsWith(extension)) {
				flc.numberOfFiles++;
				flc.numberOfLines += getNumberOfLinesFromFile(file);
			}
			return flc;
		}
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				FileLineCount childFileLineCount = countFilesAndLines(extension, f);
				flc.numberOfFiles += childFileLineCount.numberOfFiles;
				flc.numberOfLines += childFileLineCount.numberOfLines;
			}
		}

		return flc;
	}

	private static int getNumberOfLinesFromFile(File file) throws Exception {
		Scanner s = new Scanner(new FileInputStream(file));
		int count = 0;
		while (s.hasNext()) {
			s.nextLine();
			count++;
		}
		s.close();
		return count;
	}

}

class FileLineCount {
	int numberOfFiles;
	int numberOfLines;
}
