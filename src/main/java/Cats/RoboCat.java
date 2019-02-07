package Cats;

import pets.RobotPet;

public class RoboCat extends RobotPet implements Cat {

	public RoboCat(String name) {
		super(name);
	}

	@Override
	public void play() {
		this.happiness +=5;
		this.oilLevel -=5;
		this.health +=5;
	}

	@Override
	public void checkLitterBox() {
		if(LitterBox.getWaste() >= 5) {
			this.health -=1;
		}
		
	}

	@Override
	protected void tick() {
		health -= 5;
		happiness -= 5;
		oilLevel -= 5;	
	}

}