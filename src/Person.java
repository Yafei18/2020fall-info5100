
public class Person {

	void walk(boolean goodWeatherCondition) {
		System.out.println("Before making the decision of walking");
		if (goodWeatherCondition == true) {
			System.out.println("Person is walking");
		} else {
			System.out.println("I will not walk because weather is not good");
		}
		System.out.println("After making the decision of walking");
		
		//if (logic){}
		//else {}
	}

	public static void main(String[] args) {
		Person yating = new Person();
		yating.walk(true);
		System.out.println("-----");
		yating.walk(false);
	}
}
