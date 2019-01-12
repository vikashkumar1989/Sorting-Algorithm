package sort;

public class Home {
	
	private static  Home home;
	private int i;
	
	private Home() {
		i=10;
		System.out.println(i);
	}
	public static void SetupHome() {
		if(home==null) {
			home=new Home();
		}
	}
}
