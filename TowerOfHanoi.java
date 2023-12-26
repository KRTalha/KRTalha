package Recursion2;

public class TowerOfHanoi {
	
	public static void TowerOFHanoi(int n, String sour,String help ,String Desti) {
		
		if(n==1) {
			System.out.println("The disk " + n + "From " + sour + " to "+ Desti);
			return;
			
		}
		
		TowerOFHanoi(n-1,sour , Desti,help);
		System.out.println("The disk " + n + "From " + sour + " to "+ Desti);
		TowerOFHanoi(n-1,help,sour,Desti);
	}
	
	

		
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		TowerOFHanoi(n, "S" , " H" , "D");
	

	}

}
