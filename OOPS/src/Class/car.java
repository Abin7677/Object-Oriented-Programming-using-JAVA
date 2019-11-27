package Class;

import java.util.Scanner;

public class car {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String str=s.next();
	carnew c=new carnew(str);
	carnew.a();
	carnew.b();
carnew.m();
carnew.display(str);
}
}



class carnew {
	String str;
	public carnew(String str) {
		str=str;
	}
	

	public static void a() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to audi car");
	}

	public static void b() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to bmw car");
	}

	public static void m() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to maruti car");
	}

	public static void display(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	
}