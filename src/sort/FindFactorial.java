package sort;

public class FindFactorial {
	
	public static int findFact(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return (num*findFact(num-1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact = 1;
		for(int i=1;i<num;i++) {
			fact=fact*(i+1);
		}
		System.out.println(fact);
		System.out.println(findFact(5));

	}

}
