package class15.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class ObjectPersistence {

	public static void main(String[] args) throws Exception {
		writeObjectToFile();
		readObjectFromFile();

	}

	private static void readObjectFromFile() throws Exception {
		String f = "objects.dat";
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		HashMap x = (HashMap) o;
		System.out.println(x);

	}

	private static void writeObjectToFile() throws IOException, FileNotFoundException {
		Student s = new Student();
		s.roll = 100;
		s.name = "Yaqi";
		HashMap data = new HashMap();
		data.put("Siva", 100);
		data.put("Fang", 50);
		data.put("Ming", 25);
		data.put(100, s);
		String f = "objects.dat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(data);
		oos.close();
	}

}

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int roll;
	float gpa = 3.5f;

	public String toString() {
		return roll + " -> " + name + " -> " + gpa;
	}
}
