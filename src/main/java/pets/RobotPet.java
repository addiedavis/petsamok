package pets;

public abstract class RobotPet extends Pet {

	protected static final int DEFAULT_OIL_LEVEL = 10;
	protected int oilLevel;

	public RobotPet(String name) {
		super(name);
		this.oilLevel = DEFAULT_OIL_LEVEL;
	}

	public int getOil() {
		return oilLevel;
	}

	public void oil() {
		this.oilLevel = 10;
		
	}

}