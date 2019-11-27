package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime dt=LocalDateTime.now();
System.out.println(dt);

DateTimeFormatter format=DateTimeFormatter.ofPattern("E, dd : MMMM : YYYY, HH : MM : SS");
String formatDate= dt.format(format);
System.out.println(formatDate);
	}

}
