public class VirtualClassRoom {

	void startClass() {
		System.out.println("We will start virtual class");
	}
	
	public static void mainXXX(String[] args) {
		VirtualClassRoom vcr = new VirtualClassRoom();
		vcr.startClass();
		
	}
}


class Home{
	
	void drinkMilk(Milk milk){
		System.out.println("Drink milk");
	}
	
	public static void mainOld(String[] args) {
		
		Home home = new Home();
		Milk milk = new Milk();
		home.drinkMilk(milk);
	}
}

class Milk{
	
}

//Write the source code - name it as .java
//Compile the  soure code - using javac
//Run the class - using java
