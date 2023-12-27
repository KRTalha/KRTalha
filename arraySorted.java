package Recursion2;

public class arraySorted {
	
	public static boolean isSorted(int arr[] , int index) {
		
		if(index == arr.length-1) {
			return true;
		}
		
		if(arr[index] < arr[index +1]) {
			
			return isSorted(arr , index+1);
		}else {
			return false;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,6,7,8};
		System.out.println(isSorted(arr , 0));

	}

}
