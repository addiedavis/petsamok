package Dogs;

import pets.OrganicPet;

public class OrganicDog extends OrganicPet implements Dog {

	private int cageClean = 0;

	public OrganicDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happiness += 5;
		this.mess -= 5;
	}

	@Override
	protected void tick() {
		happiness -= 5;
		thirst += 5;
		hunger += 5;
		mess += 5;
		cageClean += mess / 10;
		health -= cageClean;
	}

	public void cleanCage() {
		cageClean = 0;
	}

	public Object getCageClean() {
		return cageClean;
	}

}