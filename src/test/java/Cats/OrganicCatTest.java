package Cats;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat underTest = new OrganicCat("Bill");

	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Bill"));
	}
	
	@Test
	public void shouldHaveDefaultAttributesOf10() {
		int health = underTest.getHealth();
		int happiness = underTest.getHappiness();
		int thirst = underTest.getThirst();
		int hunger = underTest.getHunger();
		int mess = underTest.getMess();
		assertThat(health, is(10));
		assertThat(happiness, is(10));
		assertThat(thirst, is(10));
		assertThat(hunger, is(10));
		assertThat(mess, is(10));
	}
	@Test
	public void shouldIncreaseHappinessBy5WhenPlayedWith() {
		underTest.play();
		int happy = underTest.getHappiness();
		assertThat(happy,is(15));
	}
	@Test
	public void shouldDecreaseHungerBy5WhenFeed() {
		underTest.feed();
		int hunger = underTest.getHunger();
		assertThat(hunger,is(5));
	}
	@Test
	public void shouldDecreaseThirstBy5WhenGivenWater() {
		underTest.water();
		int thirst = underTest.getThirst();
		assertThat(thirst,is(5));
	}
	@Test
	public void shouldDecreaseWasteBy5WhenUseLitterBox() {
		underTest.useLitter();
		int mess = underTest.getMess();
		assertThat(mess,is(5));
	}
	@Test
	public void shouldDecreaseHealthBy10WhenLitterBoxWasteIs5OrMore() {
		underTest.useLitter();
		underTest.useLitter();
		underTest.useLitter();
		underTest.useLitter();
		underTest.useLitter();
		underTest.checkLitterBox();
		int health = underTest.getHealth();
		assertThat(health, is(9));
	}
}
