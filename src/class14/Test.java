package class14;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		nameMap.put("Yinxing", 25);
		nameMap.put("Frank", 30);

		Integer x = nameMap.get("Frank");
		int xx = x;

		System.out.println(x + " -- " + xx);
		System.out.println("---------");

		Integer y = nameMap.get("Deepika");
		System.out.println(y);
		int yy = y;

		System.out.println(y + " -- " + yy);
	}

}
