package java_1012;

import java.util.ArrayList;

public class ArrayList_add_main {

	public static void main(String[] args) {
		ArrayList_add_class A1 = new ArrayList_add_class(10, "QAZ"); 
		ArrayList_add_class A2 = new ArrayList_add_class(20, "WSX");
		
		ArrayList<ArrayList_add_class> arr = new ArrayList<>();
		
		arr.add(A1);
		arr.add(A2);
		
		ArrayList_add_class B1 = arr.get(0);
		ArrayList_add_class B2 = arr.get(1);
		
		int B1_a = B1.getA();
		String B1_name = B1.getName();
		System.out.println(B1_a);
		System.out.println(B1_name);
		
		int B2_a = B2.getA();
		String B2_name = B2.getName();
		System.out.println(B2_a);
		System.out.println(B2_name);
	}

}
