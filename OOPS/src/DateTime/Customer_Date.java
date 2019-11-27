package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Customer_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String name;
String addr;
int r;
int p;
String ac;
String start;
String end;
//int price=s.nextInt();
int tot=0;
int c=0;
long total;
do {
System.out.println("Enter your name : ");
name=s.next();
System.out.println("Enter your address : ");
addr=s.next();
System.out.println("Enter number of rooms");
r=s.nextInt();
System.out.println("Enter number of persons");
p=s.nextInt();
System.out.println("AC or nonAC");
ac=s.next();
System.out.println("Booking Date");
start=s.next();
System.out.println("Checkout Date");
end=s.next();
LocalDate ds = LocalDate.parse(start);
LocalDate de = LocalDate.parse(end);
total = ChronoUnit.DAYS.between(ds,de);
//System.out.println(total);
if(p>(r*3))
{
	System.out.println("book another room");
}
}while(p>=(r*3));
int f;long amt=0;
if(p%r==0)
{
tot=1000*r;
}
else
{
f=p-(r*2);
tot=(1000*r)+(f*150);
}
if(ac.equals("yes")==true)
{
	amt=tot+(r*150);
}
else
{
	amt=tot;
}
amt=tot*total;
//long amt=(tot*total)+c;
System.out.println(name);
System.out.println(addr);
System.out.println(r);
System.out.println(p);
System.out.println(ac);
System.out.println(total);
System.out.println(amt);


	}

}
