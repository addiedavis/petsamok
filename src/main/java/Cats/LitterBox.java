package Cats;

public class LitterBox {

	private static int messLevel = 0;

	public static int getMess() {
		return messLevel;
	}
	public static void useBox() {
		messLevel +=10;
	}
	public static void clean() {
		messLevel = 0;
	}

}
