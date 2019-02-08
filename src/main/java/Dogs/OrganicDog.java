package Dogs;

import pets.OrganicPet;

public class OrganicDog extends OrganicPet implements Dog {

	private int cageClean = 0;

	public OrganicDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happy += 5;
		this.mess -= 5;
	}

	@Override
	protected void tick() {
		happy -= 1;
		thirst += 1;
		hunger += 1;
		mess += 2;
		cageClean += mess / 5;
		health -= cageClean;
	}

	public void cleanCage() {
		cageClean = 0;
	}

	public Object getCageClean() {
		return cageClean;
	}

}