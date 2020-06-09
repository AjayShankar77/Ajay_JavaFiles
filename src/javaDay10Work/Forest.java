package javaDay10Work;
import java.util.Scanner;

public class Forest {
	Scanner scanner;
	
	Forest() {
		scanner = new Scanner(System.in);
	}
		
	void createAnimal() {
		Animal animal = null;
		System.out.println("Enter the animal of your choice");
		String userInput = scanner.nextLine();
		if(userInput.toLowerCase().equals("animal"))
			animal = new Animal();
		else if(userInput.toLowerCase().equals("snake"))
			animal = new Snake();
		else if(userInput.toLowerCase().equals("monkey"))
			animal = new Monkey();
		else 
			animal = null;
		if(animal != null)
			doAnimalActivities(animal);
		else
			System.out.println("You have no animals in your forest yet...");
	}
	
	void doAnimalActivities(Animal anyAnimal) {
		anyAnimal.eat();
		anyAnimal.sleep();
		anyAnimal.move();
	}
	
	public static void main(String[] args) {
		Forest forest = new Forest();
		forest.createAnimal();

	}

}
