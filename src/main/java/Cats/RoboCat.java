package Cats;

import pets.RobotPet;

public class RoboCat extends RobotPet implements Cat {

	public RoboCat(String name) {
		super(name);
	}

	@Override
	public void play() {
		this.happy +=5;
		this.oilLevel -=5;
		this.health +=5;
	}

	@Override
	public void checkLitterBox() {
		if(LitterBox.getMess() >= 5) {
			this.health -=1;
		}
		
	}

	@Override
	protected void tick() {
		health -= 1;
		happy -= 1;
		oilLevel -= 1;	
	}

}