package Recursion2;

public class findingDuplicates {
	
	public static boolean[] map = new boolean[26];
	
	public static void remDup(String str, int index ,String newString) {
		
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
		
		
		char currChar = str.charAt(index);
		if(map[currChar -'a']) {
			remDup(str , index+1,newString);
		}else {
			newString += currChar;
			map[currChar -'a'] = true;
			remDup(str,index+1,newString);
		}
			
	}

	public static void main(String[] args) {
		String str = "aabbccddeeff";
		remDup(str, 0,"");

	}

}
