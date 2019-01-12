
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1211;
		int sum=0;
		int r=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Number is plandrome");
		}
		else {
			System.out.println("Number is not plandrome");
		}

	}

}
