
public class Student {

	public void askQuestion() {
		System.out.println("Ask a question");
	}

	public static void main(String[] args) {
		Student mingwei = new Student();
		mingwei.askQuestion();

		iPhone phone = new iPhone();
		phone.makeAPhoneCall();

	}

}

class iPhone {

	void makeAPhoneCall() {
		System.out.println("make a phone call..");
	}
}
