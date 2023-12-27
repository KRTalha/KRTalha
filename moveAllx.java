package Recursion2;

public class moveAllx {
	
	
	public static void MoveAllx(String str , int index, int count , String newString) {
		if(index ==str.length()) {
			for(int i = 0;i<count;i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		
		
		char currChar = str.charAt(index);
		if(currChar == 'x') {
			count ++;
			MoveAllx(str,index+1,count,newString);
			
		}else {
			newString += currChar;
			MoveAllx(str , index+1,count,newString);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "axfswfxsfxsfxsfcx";
		MoveAllx(str,0,0,"");

	}

}
