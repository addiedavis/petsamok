package pets;

public abstract class OrganicPet extends Pet {

	protected static final int DEFAULT_WASTE = 10;
	protected static final int DEFAULT_HUNGER = 10;
	protected static final int DEFAULT_THIRST = 10;
	protected int thirst;
	protected int hunger;
	protected int mess;


	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getMess() {
		return mess;
	}
	public OrganicPet(String name) {
		super(name);
		this.thirst = DEFAULT_THIRST;
		this.hunger = DEFAULT_HUNGER;
		this.mess = DEFAULT_WASTE;
	}

	public void feed() {
		this.hunger -=5;
	}

	public void water() {
		this.thirst -=5;
	}

}