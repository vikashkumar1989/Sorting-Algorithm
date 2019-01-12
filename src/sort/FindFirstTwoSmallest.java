package sort;

public class FindFirstTwoSmallest {
	
	public static void findSmallest(int arr[]) {
		int first, second, length=arr.length;
		first=second=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<first) {
				second=first;
				first=arr[i];
			} else if(arr[i]<second && arr[i]!=first) {
				second=arr[i];
			}
		}
		System.out.println("First smallest :"+first);
		System.out.println("Second smallest:"+second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,0,564,12,765,87,1,5,65,76,2,32};
		findSmallest(arr);

	}

}
