package inheritance;

import java.util.Scanner;

public class multi {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a car name");
	String st=s.next();
	System.out.println("Enter a series name");
	String st1=s.next();
	System.out.println("Enter a price");
	String st2=s.next();
	audi a1=new audi();
	a1.name1(st);
	model m=new model();
	m.series(st1);
	m.price(st2);
}
}
class sap
{
	void name1(String st)
	{
		System.out.println(st);
	}
}
class audi extends sap{
	void series(String st1)
	{
		System.out.println(st1);
	}
}
class model extends audi{
	void price(String st2) {
		System.out.println(st2);
	}
}