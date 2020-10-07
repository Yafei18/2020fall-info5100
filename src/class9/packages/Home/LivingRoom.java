package class9.packages.Home;

import class9.packages.Home.Kitchen.Glass;
import class9.packages.Home.Kitchen.Plate;

public class LivingRoom {

	Remote remote = new Remote();

	public void watchTVAndEat() {
		remote.onOffSwitch = true;
		
		Plate plate = new Plate();
		Glass glass = new Glass();
	}
}

