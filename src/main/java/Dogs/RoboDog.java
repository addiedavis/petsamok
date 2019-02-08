package Dogs;

import pets.RobotPet;

public class RoboDog extends RobotPet implements Dog{

	public RoboDog(String name) {
		super(name);
	}

	@Override
	public void walk() {
		this.happy += 5;
		this.oilLevel -=5;
		this.health +=5;
	}

	@Override
	protected void tick() {
		health -= 1;
		happy -= 1;
		oilLevel -=1;		
	}
}