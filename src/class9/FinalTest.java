package class9;

public class FinalTest {

	public static void main(String[] args) {
		iPhone sivasIPhone = new iPhone("yyyy");
		// sivasIPhone.inventorName = "Siva";
		// System.out.println(sivasIPhone.inventorName);
		System.out.println(sivasIPhone.getInventorName());

		iPhoneX yidansPhone = new iPhoneX("xxxx", 128);
		yidansPhone.openCase();
		System.out.println(yidansPhone.getMemoryInGB());
		System.out.println(yidansPhone.getSerialNumber());

	}

}

class Circle{
	public final static double PI = 22.0/7;
	private double radius;
	
	public final double getArea() {
		return PI * radius * radius;
	}
}


class RedCircle extends Circle{
	
}


class iPhone {
	private final String inventorName = "Steve Jobs";
	private final String serialNumber;

	iPhone(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public final String getInventorName() {
		return inventorName;
	}

	public final String getSerialNumber() {
		return serialNumber;
	}

	public final void callOtherIPhone() {

	}
}

class iPhoneX extends iPhone {

	private final double memoryInGB;

	// public final void callOtherIPhone() {

	// }

	public double getMemoryInGB() {
		return memoryInGB;
	}

	public iPhoneX(String serialNumber, double memory) {
		super(serialNumber);
		this.memoryInGB = memory;

	}

	public iPhoneX() {
		super("aaaa");
		memoryInGB = 64;

	}

	/*
	 * public String getSerialNumber() { return "ABC" + super.getSerialNumber(); }
	 */

	public void openCase() {
		System.out.println("Open case");
		// memoryInGB = 64;
		System.out.println("Close case");
	}
}

class iPhone12 extends iPhoneX {

	public iPhone12(String serialNumber, double memoryInGB) {
		super(serialNumber, memoryInGB);
	}

}

class Car {

}

class GMBrand extends Car {

}

class Chevrolet extends GMBrand {

}

class ElectricChevrolet extends Chevrolet {

}

final class Hummer extends GMBrand {

}

//class ElectricHummer extends Hummer {

//}
