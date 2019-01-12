package sort;

public class P02_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {5,2,54,3,7,4,5,35,9,7};
		
		int k=a.length;
		int minimum;
		
		for(int i=0;i<k-1;i++) {
			minimum=i;
			for(int j=i+1;j<k;j++) {
				if(a[j]<a[minimum]) {
					minimum=j;
				}
			}
			int temp=a[minimum];
			a[minimum]=a[i];
			a[i]=temp;
		}
		
		System.out.println("After Sort");
		for(int i=0;i<k;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
