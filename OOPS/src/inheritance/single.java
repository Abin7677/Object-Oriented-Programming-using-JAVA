package inheritance;

import java.util.Scanner;

public class single {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the car speed");
	int a=s.nextInt();
	toyota t=new toyota();
	t.name();
	t.speed(a);
}
}
class car{
	void name(){
		System.out.println("toyota");
	}
}
class toyota extends car
{
	void speed(int a) {
		System.out.println("Speed=>"+a);
	}
}