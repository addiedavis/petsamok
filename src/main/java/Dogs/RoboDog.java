package Dogs;

import roboPets.RoboPets;

public class RoboDog implements RoboPets {

	private String name;
	private int happy;
	private int oil;
	private int mess;
	public RoboDog(String name, int happy, int oil, int mess) {
		this.name = name;
		this.happy = happy;
		this.oil = oil;
		this.mess = mess;
	}

	@Override 
	public String getName() {
		return name;
	}
	

	@Override
	public int getHappy() {
		// TODO Auto-generated method stub
		return happy;
	}

	@Override
	public int getMess() {
		// TODO Auto-generated method stub
		return mess;
	}
	
	@Override
	public int getOil() {
		return oil;
	}
	
	public void walk() {
		happy += 5;
		
	}
	
	@Override
	public void oil() {
		oil -= 5;
	}
}
