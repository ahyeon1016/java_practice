package java_1012;

import java.util.ArrayList;

public class ArrayList_remove {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("Lion");
		animals.add("Monkey");
		animals.add("Rabbit");
		
		System.out.println(animals);
		
		animals.remove(0);
		System.out.println(animals);
		
		animals.remove("Rabbit");
		System.out.println(animals);
	}

}
