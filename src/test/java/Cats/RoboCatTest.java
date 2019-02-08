package Cats;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RoboCatTest {

	RoboCat underTest = new RoboCat("Jinx");
	OrganicCat cat = new OrganicCat("Cat"); 

	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Jinx"));
	}
	
	@Test
	public void shouldHaveDefaultAttributesOf10() {
		int health = underTest.getHealth();
		int happiness = underTest.getHappy();
		int oilLevel = underTest.getOil();
		assertThat(health, is(10));
		assertThat(happiness, is(10));
		assertThat(oilLevel, is(10));
	}
	@Test
	public void shouldIncreaseHappinessBy5WhenPlayedWith() {
		underTest.play();
		int happy = underTest.getHappy();
		assertThat(happy,is(15));
	}
	@Test
	public void shouldDecreaseOilLevelBy5WhenPlayedWith() {
		underTest.play();
		int oilLevel = underTest.getOil();
		assertThat(oilLevel,is(5));
	}
	@Test
	public void shouldIncreaseOilLevelTo10WhenOilChanged() {
		underTest.play();
		underTest.oil();
		int oilLevel = underTest.getOil();
		assertThat(oilLevel,is(10));
	}
	@Test
	public void shouldDecreaseHealthBy10WhenLitterBoxWasteIs5rMore() {
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		underTest.checkLitterBox();
		int health = underTest.getHealth();
		assertThat(health, is(9));
	}
}