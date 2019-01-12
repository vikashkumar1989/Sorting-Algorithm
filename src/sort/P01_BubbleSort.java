package sort;

public class P01_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,5,6,19,8,7,3,6,4,0};
		int k=a.length;
		
		System.out.println("Before Sort");
		for(int i=0;i<k;i++) {
			System.out.print(a[i]+" ");
		}	
		
		//Logic
		for(int i=0;i<k-1;i++) {
			for(int j=0;j<k-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\n"+"After Sort");
		for(int i=0;i<k;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
