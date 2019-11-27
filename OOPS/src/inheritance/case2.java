package inheritance;

import java.util.Scanner;

public class case2 {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter persons");
	int p=s.nextInt();
	System.out.println("Enter days");
	int d=s.nextInt();
	System.out.println("Enter tarif per person");
	int t=s.nextInt();
	System.out.println("Enter room type");
	String r =s.next();
	peakSeason ps=new peakSeason();
	leanSeason ls=new leanSeason();
	int amt=ls.book(p,d,t);
	System.out.println("Enter month");
	int month=s.nextInt();
	switch(month)
	{
	case 4:
	case 5:
	case 6:
	case 9:
	case 11:
	case 12:
		ps.peak(amt);
		break;
	case 1:
	case 2:
	case 3:
	case 7:
	case 8:
	case 10:
		ls.lean(amt);
	}
}}
class booked{
	int total;
	int book(int p,int d,int t)
	{
		total=p*d*t;
		return total;
		}
}
class peakSeason extends booked
{
	int tot;
	void peak(int amt)
	{
		
		tot=amt+500;
		System.out.println("total="+tot);
		}
	}

class leanSeason extends booked
{
	int tot1;
	void lean(int amt)
	{
	tot1=amt-500;
	System.out.println("total="+tot1);
	}
}

