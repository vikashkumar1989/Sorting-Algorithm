package sort;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_");
		System.out.println(screenshotName);
		
		Calendar c=Calendar.getInstance();
		
		System.out.println(c.getFirstDayOfWeek());

	}

}
