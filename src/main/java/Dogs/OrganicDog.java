package Dogs;

public class OrganicDog  {

	private String name;
	private int hunger;
	private int thirst;
	private int happy;
	private int health;
	private int mess;

	public OrganicDog(String name, int hunger, int thirst, int happy, int health, int mess) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.happy = happy;
		this.health = health;
		this.mess = mess;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHappy() {
		return happy;
	}
	
	public int getHealth() {
		return health;
	}

	public int getMess() {
		return mess;
	}

	public void walk() {
		happy += 5;
		
	}

	public void feed() {
		hunger -= 5;
		
	}

	public void drink() {
		thirst -=5;		
	}

	
	
}
