package Recursion2;

public class firstlastoccurance {
	
	public static int first = -1;
	public static int last = -1;
	
	public static void findOccurance(String str , int index , char elmt) {
		
		if(index == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		
		char crntChar = str.charAt(index);
		if(crntChar == elmt) {
			if(first == -1) {
				first  = index;
			}else {
				last = index;
			}
		}
		
		findOccurance(str , index +1 , elmt);
		
		
	}

	public static void main(String[] args) {
		
		String str = "ranatalhamahmood";
		
		findOccurance(str , 0 ,'a');
		

	}

}
