package DateTime;

import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
System.out.println("At present year : "+calendar.get(Calendar.YEAR));
System.out.println("At present date : "+calendar.get(Calendar.DATE));
System.out.println("At present day : "+calendar.getTime());
calendar.add(Calendar.DATE,-7);
System.out.println("Before 7 Days : "+calendar.getTime());
calendar.add(Calendar.MONTH,10);
System.out.println("After 10 Days : "+calendar.getTime());
calendar.add(Calendar.YEAR,10);
System.out.println("After 10 Days : "+calendar.getTime());
	}

}
