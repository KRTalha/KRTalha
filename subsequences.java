package Recursion2;

public class subsequences {
	
	public static void subSequences(String str , int index , String newString ) {
		if(index == str.length()){
			System.out.println(newString);
			return;
		}
		
		
		char currChar = str.charAt(index);
		// to be sequences 
		subSequences(str, index+1,newString+currChar);
		// to be not Sequences
		subSequences(str,index+1,newString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sdf";
		subSequences(str,0,"");
	}

}
