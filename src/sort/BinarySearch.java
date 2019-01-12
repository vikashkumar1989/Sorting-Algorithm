package sort;

public class BinarySearch {
	
	public static int search(int arr[], int f, int l, int x) {
		
		if(l>=1) {
			int m=f+(l-f)/2;
			
		
			if(x==arr[m]) {				
				return m;
			}
			if(x>arr[m]) {
				search(arr, m+1, l, x);
			}
			if(x<arr[m]) {
				search(arr, f, m-1, x);
			}	
		}
		return -1;		
	}
	public static int searchitr(int arr[], int x) {
		int f=0;
		int l=arr.length-1;
		while(l>=f) {
			int mid=f+(l-f)/2;
			if(arr[mid]==x) {
				return mid;				
			}else if(arr[mid]<x) {
				f=mid+1;
			}else {
				l=mid-1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,34,45,56,67,78,89,90,95};
		int n=arr.length;
		int j=searchitr(arr,899);
		if(j==-1)
			System.out.println("Number not Found");
		else
			System.out.println("Number found");

	}

}
