package java_1009;

public class String_equals2 {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abcdabcd";
		
		String str1_str;
		String str2_str;
		
		int index = 0;
		
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				str1_str = str1.substring(i,i+1);
				str2_str = str2.substring(j,j+1);
				if(str1_str.equals(str2_str)) {
					System.out.println("str1의"+i+"번째 문자"+str1_str+"가 str2의"+j+"번째 문자"+str2_str+"와 같다");
					index++;
				}
			}
		}
		
		System.out.println(index);
		
	}
}
