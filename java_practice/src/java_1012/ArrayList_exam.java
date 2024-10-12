package java_1012;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_exam {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String score;
		
		while(true) {
			System.out.println("저장할 문자, 숮자를 입력해 주세요.");
			System.out.println("N 을 입력하면 종료됩니다.");
			score = sc.nextLine();
			
			if(score.equals("N")) {
				System.out.println("N을 입력하셨습니다 종료합니다.");
				break;
			}
			
			System.out.println(score+"를 입력하셨습니다.");
			
			arr.add(score);
			
			System.out.println("저장된 정보 = " +arr);
		}
		
	}
	
}
