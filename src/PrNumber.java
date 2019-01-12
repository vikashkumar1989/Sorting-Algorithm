
public class PrNumber {

	public static void main(String[] args) {
		int num=19;
		int k=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Number is not Prime");
				k=1;
				break;
			}
		}
		if(k==0) {
			System.out.println("Number is Prime");
		}

	}

}
