package sort;

public class P03_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 5, 2, 54, 3, 7, 4, 5, 35, 9, 7 };
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && temp<a[j-1]) {
				a[j]=a[j-1];
				j=j-1;
				a[j]=temp;
			}
			
		}
		System.out.println("After Sort");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
