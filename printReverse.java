package Recursion2;

public class printReverse {
	
	public static void printRev(String str, int index) {
		if(index == 0) {
			System.out.print(str.charAt(index));
			return;
		}
		
		
		System.out.print(str.charAt(index));
		printRev(str , index -1);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "qesfrsfgwfsd";
		printRev(str ,str.length()-1);
		

	}

}
