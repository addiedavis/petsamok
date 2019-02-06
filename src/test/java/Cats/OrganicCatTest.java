package Cats;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class OrganicCatTest {

	OrganicCat underTest = new OrganicCat("Toby", 10, 10, 10, 10, 10);
	
	
	@Test
	public void shouldHaveNamewithHungerThirstHappyHealthAndMessLevel() {
		String foundName = underTest.getName();
		int foundHunger= underTest.getHunger();
		int foundThirst= underTest.getThirst();
		int foundHappy= underTest.getHappy();
		int foundHealth= underTest.getHealth();
		int foundMess= underTest.getMess();
		assertThat(foundName, is("Toby"));
		assertThat(foundHunger, is(10));
		assertThat(foundThirst, is(10));
		assertThat(foundHealth, is(10));
		assertThat(foundHappy, is(10));
		assertThat(foundMess, is(10));
	}
	
	@Test
	public void shouldDecreaseHungerBy5WhenFed() {
		underTest.feed();
		int foundHunger= underTest.getHunger();
		assertThat(foundHunger, is(5));
		
	}
	
	@Test
	public void shouldDecreaseThirstBy5WhenWatered() {
		underTest.drink();
		int foundThirst= underTest.getThirst();
		assertThat(foundThirst, is(5));
	}

//	@Test
//	public void shouldBeAnInstanceOfOrganicPet() {
//		assertThat(underTest, instanceOf(Cats.class));
//	}
}
