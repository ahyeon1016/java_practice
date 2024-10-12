package java_1012;

import java.util.ArrayList;

public class ArrayList_get {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");

		String red = colors.get(0);
		String blue = colors.get(1);
		String yellow = colors.get(2);
		
		System.out.println(red);
		System.out.println(blue);
		System.out.println(yellow);
	}

}
