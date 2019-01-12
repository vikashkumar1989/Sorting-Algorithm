package sort;

public class LinearSearch {
	
	public static int search(int arr[], int num) {
		int length =arr.length;
		for(int i=0;i<length;i++) {
			if(num==arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int arr[]= {12,34,45,56,67,76,43,212};
		int i=search(arr, 45);
		if(i==-1)
			System.out.println("number not found");
		else
			System.out.println("number found at index :"+i);
	}

}
