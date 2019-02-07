package Dogs;

import pets.RobotPet;

public class RoboDog extends RobotPet implements Dog{

	public RoboDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happiness += 5;
		this.oilLevel -=5;
		this.health +=5;
	}

	@Override
	protected void tick() {
		health -= 5;
		happiness -= 5;
		oilLevel -=5;		
	}
}