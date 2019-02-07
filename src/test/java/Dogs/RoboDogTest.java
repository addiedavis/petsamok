package Dogs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RoboDogTest {

	RoboDog underTest = new RoboDog("Tobias");
	
	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Tobias"));
	}
	@Test
	public void shouldReturnDefaultAttributes() {
		int health = underTest.getHealth();
		int happiness = underTest.getHappiness();
		int oilLevel = underTest.getOil();
		assertThat(health, is(10));
		assertThat(happiness, is(10));
		assertThat(oilLevel, is(10));
	}
	@Test
	public void shouldIncreaseHappinessBy5WhenWalked() {
		underTest.walk();
		int happy = underTest.getHappiness();
		assertThat(happy,is(15));
	}
	@Test
	public void shouldDecreaseOilLevelBy5WhenWalked() {
		underTest.walk();
		int mess = underTest.getOil();
		assertThat(mess,is(5));
	}
	@Test
	public void shouldIncreaseOilLevelTo10WhenOilChanged() {
		underTest.walk();
		underTest.oil();
		int oilLevel = underTest.getOil();
		assertThat(oilLevel,is(10));
	}
}