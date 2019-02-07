package Dogs;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("Henry");
	
	@Test
	public void shouldHaveName() {
		String name = underTest.getName();
		assertThat(name, is("Henry"));
	}
	
	@Test
	public void shouldHaveDefaultAttributes() {
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
	public void shouldIncreaseHappinessBy5WhenWalked() {
		underTest.walk();
		int happy = underTest.getHappiness();
		assertThat(happy,is(15));
	}
	@Test
	public void shouldDecreaseWasteBy5WhenWalked() {
		underTest.walk();
		int mess = underTest.getMess();
		assertThat(mess,is(5));
	}
	@Test
	public void shouldDecreaseHungerBy50WhenFeed() {
		underTest.feed();
		int hunger = underTest.getHunger();
		assertThat(hunger,is(5));
	}
	@Test
	public void shouldDecreaseThirstBy50WhenGivenWater() {
		underTest.water();
		int thirst = underTest.getThirst();
		assertThat(thirst,is(5));
	}
}