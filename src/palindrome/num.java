package palindrome;

public class num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int sum = 0,r;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("number is Plandrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}

}
