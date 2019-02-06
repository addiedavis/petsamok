package Dogs;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("Toby", 10, 10, 10, 10, 10);

	@Test
	public void shouldHaveNamewithHungerThirstHappyHealthAndMessLevel() {
		String foundName = underTest.getName();
		int foundHunger = underTest.getHunger();
		int foundThirst = underTest.getThirst();
		int foundHappy = underTest.getHappy();
		int foundMess = underTest.getMess();
		assertThat(foundName, is("Toby"));
		assertThat(foundHunger, is(10));
		assertThat(foundThirst, is(10));
		assertThat(foundThirst, is(10));
		assertThat(foundHappy, is(10));
		assertThat(foundMess, is(10));
	}

	@Test
	public void shouldIncreaseHappyby5WhenWalked() {
		underTest.walk();
		int foundHappy = underTest.getHappy();
		assertThat(foundHappy, is(15));
	}

	@Test
	public void shouldDecreaseHungerBy5WhenFed() {
		underTest.feed();
		int foundHunger = underTest.getHunger();
		assertThat(foundHunger, is(5));

	}

	@Test
	public void shouldDecreaseThirstBy5WhenWatered() {
		underTest.drink();
		int foundThirst = underTest.getThirst();
		assertThat(foundThirst, is(5));
	}
	
//	@Test
//	public void shouldBeAnInstanceOfOrganicPet() {
//		assertThat(underTest, instanceOf(Dogs.class));
//	}

}
