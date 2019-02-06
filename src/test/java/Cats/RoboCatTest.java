package Cats;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.Test;

import roboPets.RoboPets;

public class RoboCatTest {
	RoboPets underTest = new RoboCat("Paul", 10, 10, 10);

	@Test
	public void shouldHaveNameHappyOilMess() {
		String foundName = underTest.getName();
		int foundHappy = underTest.getHappy();
		int foundOil = underTest.getOil();
		int foundMess = underTest.getMess();
		assertThat(foundName, is("Paul"));
		assertThat(foundHappy, is(10));
		assertThat(foundOil, is(10));
		assertThat(foundMess, is(10));
	}

	@Test
	public void shouldDecreaseOilBy5WhenOiled() {
		underTest.oil();
		int foundOil = underTest.getOil();
		assertThat(foundOil, is(5));
	}
	@Test
	public void shouldBeAnInstanceOfOrganicPet() {
		assertThat(underTest, instanceOf(RoboPets.class));
	}

}