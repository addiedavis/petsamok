package Cats;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import pets.PetShelter;

public class LitterBoxTest {

	LitterBox underTest = new LitterBox();
	
	PetShelter shelter = new PetShelter();
	OrganicCat cat = new OrganicCat("Joe");

	@Test
	public void shouldBeAbleToIncreaseWasteLevelInLitterBox() {
		shelter.addPet(cat);
		shelter.useLitterBox(underTest);
		int mess = LitterBox.getWaste();
		assertThat(mess, is(10));
	}
	@Test 
	public void literBoxWasteShouldBe0AfterCleaing() {
		shelter.addPet(cat);
		shelter.useLitterBox(underTest);
		LitterBox.clean();
	}
}
