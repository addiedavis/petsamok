package Cats;

public class LitterBox {

	private static int wasteLevel = 0;

	public static int getWaste() {
		return wasteLevel;
	}
	public static void useBox() {
		wasteLevel +=10;
	}
	public static void clean() {
		wasteLevel = 0;
	}

}
