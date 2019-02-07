package VirtualPetShelterTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

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
		assertThat(pets,containsInAnyOrder(dog,roboDog));
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
		assertThat(dogHunger,is(5));
		assertThat(catHunger,is(5));
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
		assertThat(dogThirst,is(5));
		assertThat(catThirst,is(5));
	}
	@Test
	public void shouldBeAbleToWalkAllDogs() {
		underTest.addPet(dog);
		underTest.addPet(roboDog);
		underTest.walkDogs();
		int dogHappiness = dog.getHappiness();
		int roboDogHappiness = roboDog.getHappiness();
		assertThat(dogHappiness,is(15));
		assertThat(roboDogHappiness,is(15));
	}
	@Test
	public void shouldBeAbleToPlayWithAllCats() {
		underTest.addPet(cat);
		underTest.addPet(roboCat);
		underTest.playWithCats();
		int catHappiness = cat.getHappiness();
		int roboCatHappiness = cat.getHappiness();
    	assertThat(catHappiness,is(15));
    	assertThat(roboCatHappiness,is(15));
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
		assertThat(dogOilLevel,is(10));
		assertThat(catOilLevel,is(10));
	}
}

