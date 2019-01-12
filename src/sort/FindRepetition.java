package sort;

import java.util.ArrayList;

public class FindRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,3,3,4,7,5,8,3,8,8,3,4};
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!a1.contains(a[i])) {
				k++;
				a1.add(a[i]);
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]+" is repeated "+k+" times");
				if(k==1) {
					System.out.println(a[i]+ " is Unique number");
				}
				
			}
		}

	}

}
