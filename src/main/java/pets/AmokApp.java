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
			System.out.println(
					"Welcome to the pet shelter.\nThe pets have started to run amok!\nHere are the current pets: ");
			System.out.format("%10s %11s %10s %10s %10s %10s %10s %10s %10s", "Name:", "Type", "Health", "Happiness",
					"Oil", "Thirst", "Hunger", "Mess", "Cage's Mess");
			System.out.println();
			myShelter.petsOutput();
			System.out.println("Litter box:" + LitterBox.getMess()
					+ "\n[The Organic Cats will use the Litter Box a lot.]\nWhat would you like to do?\n");
			getOptions();
			int userInput = input.nextInt();
			elvaulateChoice(userInput);
			myShelter.tick();
		}

	}

	private static void getOptions() {
		System.out.println(
				"1. Feed organic pets\n2. Give the pets water\n3. Oil the robot pets\n4. Walk the dogs\n5. Play with the cats\n6. Clean the litter Box\n7. Clean the dog cages\n8. Admit a pet to the shelter\n9. Quit");
	}

	private static void elvaulateChoice(int choice) {
		switch (choice) {
		case 1:
			myShelter.feed();
			break;
		case 2:
			myShelter.giveWater();
			break;
		case 3:
			myShelter.changeAllOil();
			break;
		case 4:
			myShelter.walkDogs();
			break;
		case 5:
			myShelter.playWithCats();
			break;
		case 6:
			LitterBox.clean();
			break;
		case 7:
			myShelter.cleanCages();
			break;
		case 8:
			addPet();
			break;
		case 9:
			System.exit(0);
		}

	}

	private static void addPet() {
		System.out.println("What is the name of the pet?");
		String name = input.nextLine();
		name = input.nextLine();
		String newPetName = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println("What kind of pet is " + newPetName + "?");
		System.out.println(
				"Press 1 for Organic Dog\nPress 2 for Robo Dog\nPress 3 for Organic Cat\nPress 4 for Robo Cat");
		int kindOfPet = input.nextInt();
		switch (kindOfPet) {
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
