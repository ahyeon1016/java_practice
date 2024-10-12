package java_1012;

import java.util.ArrayList;

public class ArrayList_size {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		
		for(int i=4; i<=100; i++) {
			num.add(i);
		}
		
		System.out.println(num.size());
	}

}
