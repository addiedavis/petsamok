package Cats;

import roboPets.RoboPets;

public class RoboCat implements RoboPets {

	private String name;
	private int happy;
	private int oil;
	private int mess;

	public RoboCat(String name, int happy, int oil, int mess) {
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
		return happy;
	}

	@Override
	public int getOil() {
		return oil;
	}

	@Override
	public int getMess() {
		return mess;
	}

	@Override
	public void oil() {
		oil -=5;
	}

}
