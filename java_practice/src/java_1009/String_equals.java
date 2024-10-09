package java_1009;

public class String_equals {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "abc";
		
		if(str1.equals(str2)) {
			System.out.println("문자열이 같다.");
		} else {
			System.out.println("문자열이 다르다.");
		}
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("대소문자 구분 없이 문자열이 같다.");
		}
	}
}
