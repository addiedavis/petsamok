package pets;

import java.util.Scanner;

import Cats.LitterBox;
import Cats.OrganicCat;
import Cats.RoboCat;
import Dogs.OrganicDog;
import Dogs.RoboDog;

public class AmokApp {

	static Scanner input = new Scanner(System.in);
	private static PetShelter myShelter = new PetShelter();

	public static void main(String[] args) {

		OrganicDog dog = new OrganicDog("Toby");
		RoboDog roboDog = new RoboDog("Henry");
		OrganicCat cat = new OrganicCat("Felix");
		RoboCat roboCat = new RoboCat("Rex");
		myShelter.addPet(dog);
		myShelter.addPet(roboDog);
		myShelter.addPet(cat);
		myShelter.addPet(roboCat);

		while (true) {
			System.out.println("Welcome to the pet shelter.\nThe pets have started to run amok!\nHere are the current pets: ");
			System.out.format("%10s %11s %10s %10s %10s %10s %10s %10s %10s", "Name:", "Type", "Health", "Happiness",
					"Oil", "Thirst", "Hunger", "Mess", "Cage Dirt");
			System.out.println();
			myShelter.petsOutput();
			System.out.println("Litter box:" + LitterBox.getMess());
			System.out.println("");
			System.out.println("What would you like to do with our pets?");
			getOptions();
			int choice = input.nextInt();
			elvaulateChoice(choice);
			myShelter.tick();
		}

	}

	private static void getOptions() {
		System.out.println("1. Feed organic pets");
		System.out.println("2. Oil the robot pets");
		System.out.println("3. Give the pets water");
		System.out.println("4. Play with the cats");
		System.out.println("5. Walk the dogs");
		System.out.println("6. Have the cats use the litter box");
		System.out.println("7. Clean the litter Box");
		System.out.println("8. Clean the dog cages");
		System.out.println("9. Admit a pet to the shelter");
		System.out.println("10. Quit");

	}

	private static void elvaulateChoice(int choice) {
		switch (choice) {
		case 1:
			myShelter.feed();
			break;
		case 2:
			myShelter.changeAllOil();
			break;
		case 3:
			myShelter.giveWater();
			break;
		case 4:
			myShelter.playWithCats();
			break;
		case 5:
			myShelter.walkDogs();
			break;
		case 6:
			myShelter.catsUseBox();
			break;
		case 7:
			LitterBox.clean();
			break;
		case 8:
			myShelter.cleanCages();
			break;
		case 9:
			addPet();
			break;
		case 10:
			System.exit(0);
		}

	}

	private static void addPet() {
		System.out.println("What is the name of the pet?");
		String name = input.nextLine();
		name = input.nextLine();
		String newPetName = name.substring(0, 1).toUpperCase() + name.substring(1);
		
		System.out.println("What kind of pet is " + newPetName + "?");
		
		System.out.println("Press 1 for Organic Dog");
		System.out.println("Press 2 for Robo Dog");
		System.out.println("Press 3 for Organic Cat");
		System.out.println("Press 4 for Robo Dog");
		int selection = input.nextInt();
		switch (selection) {
		case 1:
			OrganicDog dog = new OrganicDog(newPetName);
			myShelter.addPet(dog);
			System.out.println("Added " + newPetName + " the Organic Dog.");
			break;
		case 2:
			RoboDog roboDog = new RoboDog(newPetName);
			myShelter.addPet(roboDog);
			System.out.println("Added " + newPetName + " the Robo Dog.");
			break;
		case 3:
			OrganicCat cat = new OrganicCat(newPetName);
			myShelter.addPet(cat);
			System.out.println("Added " + newPetName + " the Organic Cat.");
			break;
		case 4:
			RoboCat roboCat = new RoboCat(newPetName);
			myShelter.addPet(roboCat);
			System.out.println("Added " + newPetName + " the Robo Cat.");
			break;
		}
	}
}
