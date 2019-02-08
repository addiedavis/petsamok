package VirtualPetShelterTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

import Cats.LitterBox;
import Cats.OrganicCat;
import Cats.RoboCat;
import Dogs.OrganicDog;
import Dogs.RoboDog;
import pets.Pet;
import pets.PetShelter;

public class PetShelterTest {

	PetShelter underTest = new PetShelter();
	OrganicDog dog = new OrganicDog("Toby");
	RoboDog roboDog = new RoboDog("Maggie");
	OrganicCat cat = new OrganicCat("Felix");
	RoboCat roboCat = new RoboCat("Rex");

	@Test
	public void shouldBeAbleToAddPet() {
		underTest.addPet(dog);
		Collection<Pet> pets = underTest.getPets();
		assertThat(pets, contains(dog));
	}

	@Test
	public void shouldBeAbleToAddPetsOfDifferentTypes() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		Collection<Pet> pets = underTest.getPets();
		assertThat(pets, containsInAnyOrder(dog, roboDog));
	}

	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.feed();
		int dogHunger = dog.getHunger();
		int catHunger = cat.getHunger();
		assertThat(dogHunger, is(5));
		assertThat(catHunger, is(5));
	}

	@Test
	public void shouldBeAbleToWaterAllOrganicPets() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.giveWater();
		int dogThirst = dog.getThirst();
		int catThirst = cat.getThirst();
		assertThat(dogThirst, is(5));
		assertThat(catThirst, is(5));
	}

	@Test
	public void shouldBeAbleToWalkAllDogs() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.walkDogs();
		int dogHappiness = dog.getHappy();
		int roboDogHappiness = roboDog.getHappy();
		assertThat(dogHappiness, is(15));
		assertThat(roboDogHappiness, is(15));
	}

	@Test
	public void shouldBeAbleToPlayWithAllCats() {
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.playWithCats();
		int catHappiness = cat.getHappy();
		int roboCatHappiness = cat.getHappy();
		assertThat(catHappiness, is(15));
		assertThat(roboCatHappiness, is(15));
	}

	@Test
	public void shouldBeAbleToChangeOilInAllRobotPets() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.walkDogs();
		underTest.playWithCats();
		underTest.changeAllOil();
		int dogOilLevel = roboDog.getOil();
		int catOilLevel = roboCat.getOil();
		assertThat(dogOilLevel, is(10));
		assertThat(catOilLevel, is(10));
	}

	@Test
	public void shouldHaveAttributesGoDownForTickOrganicCatWithMessyLitter() {
		underTest.addPet(cat);
		LitterBox.clean();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		underTest.tick();
		int foundHappy = cat.getHappy();
		int foundThirst = cat.getThirst();
		int foundHunger = cat.getHunger();
		int foundHealth = cat.getHealth();
		assertThat(foundHappy, is(5));
		assertThat(foundThirst, is(15));
		assertThat(foundHunger, is(15));
		assertThat(foundHealth, is(9));
	}

	@Test
	public void shouldHaveAttributesGoDownForTickRoboticCatWithMessyLitter() {
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		LitterBox.clean();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		cat.useLitter();
		underTest.tick();
		int foundHappy = roboCat.getHappy();
		int foundOil = roboCat.getOil();
		int foundHealth = roboCat.getHealth();
		assertThat(foundHappy, is(9));
		assertThat(foundOil, is(9));
		assertThat(foundHealth, is(9));
	}
	
	@Test
	public void shouldHaveAttributesGoDownForTickOrganicDog() {
		underTest.addPet(dog);
		underTest.cleanCages();
		underTest.tick();
		int foundHappy = dog.getHappy();
		int foundThirst = dog.getThirst();
		int foundHunger = dog.getHunger();
		int foundMess = dog.getMess();
		assertThat(foundHappy, is(9));
		assertThat(foundThirst, is(11));
		assertThat(foundHunger, is(11));
		assertThat(foundMess, is(12));
	}
	
	@Test
	public void shouldHaveAttributesGoDownForTickOrganicDogWithMessyCage() {
		underTest.addPet(dog);
		underTest.cleanCages();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		int foundHappy = dog.getHappy();
		int foundThirst = dog.getThirst();
		int foundHunger = dog.getHunger();
		int foundMess = dog.getMess();
		assertThat(foundHappy, is(5));
		assertThat(foundThirst, is(15));
		assertThat(foundHunger, is(15));
		assertThat(foundMess, is(20));
	}
	@Test
	public void shouldHaveAttributesGoDownForTickRoboDog() {
		underTest.addPet(roboDog);
		underTest.cleanCages();
		underTest.tick();
		int foundHappy = roboDog.getHappy();
		int foundOil = roboDog.getOil();
		int foundHealth = roboDog.getHealth();
		assertThat(foundHappy, is(9));
		assertThat(foundOil, is(9));
		assertThat(foundHealth, is(9));
	}
}
