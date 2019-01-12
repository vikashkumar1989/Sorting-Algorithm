
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="VIKIVW";
		String s2="";
		for(int i=s1.length();i>0;i--) {
			s2=s2+s1.charAt(i-1);
		}
		if(s1.equals(s2)) {
			System.out.println("String is Palndrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}

	}

}
