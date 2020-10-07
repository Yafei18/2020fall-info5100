package class9;

import static java.lang.Math.abs;
import static java.lang.Math.ceil;

import java.util.ArrayList;
import java.util.Collection;

import class7.Account;
import class7.Person;
import class8.Earth;

public class PackagedClass {

	public static void main(String args[]) {
		System.out.println(abs(-56.3f));
		System.out.println(ceil(45.5f));
		Account account = new Account();
		Person person = new Person();
		Earth earth = new Earth();
		class7.Home home = new class7.Home();
		class8.Home anotherHome = new class8.Home();
		//home = anotherHome;

		String student = "Yinxing";
		Collection c = new ArrayList();
	}

}
