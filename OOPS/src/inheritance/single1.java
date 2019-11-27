package inheritance;

import java.util.Scanner;

public class single1 {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a mark");
	int a=s.nextInt();
	mark m=new mark();
	m.cname();
	m.sname();
	m.score(a);
}
}
class college{
	void cname() {
		System.out.println("Santhigiri college");
	}
	void sname() {
		System.out.println("Abin Baby");
	}
}
class mark extends college
{
	void score(int a) {
		System.out.println("mark ="+a);
	}
}