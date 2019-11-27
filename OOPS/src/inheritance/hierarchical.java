package inheritance;

import java.util.Scanner;

public class hierarchical {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String st=s.next();
	String st1=s.next();
	Apple a=new Apple();
	Orange o=new Orange();
	a.color(st);
	o.color1(st1);
}
}
class fruit{
	void fruits()
	{
		System.out.println("apple");
		System.out.println("orange");
		}
}
class Apple extends fruit
{
	void color(String st) {
		System.out.printf("apple=%s",st);
		System.out.println();
	}
}
class Orange extends fruit{
	void color1(String st1)
	{
		System.out.printf("orange=%s",st1);
	}
}