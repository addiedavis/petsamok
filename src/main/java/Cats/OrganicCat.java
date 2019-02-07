package Cats;

import pets.OrganicPet;

public class OrganicCat extends OrganicPet implements Cat{

	public OrganicCat(String name) {
		super(name);
	}

	@Override
	public void play() {
		this.happiness +=5;
	}

	public void useLitter() {
		this.mess -=5;
		LitterBox.useBox();
	}

	@Override
	public void checkLitterBox() {
		if(LitterBox.getMess() >= 5) {
			this.health -=1;
		}
		
	}

	@Override
	protected void tick() {
		happiness -= 5;
		thirst += 5;
		hunger += 5;
		mess += 5;
		int healthChange = LitterBox.getMess() / 10;
		health -= healthChange;
		
	}
	
}