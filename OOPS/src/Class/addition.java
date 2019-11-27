package Class;

import java.util.Scanner;

public class addition {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter three numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int c1=0;
	add c=new add(a,b);
	//add.display(c);
	
}
}
class add{
	int a;int b;int c1;
	public add(int a, int b)
	{
		
		c1=a+b;
		System.out.println(c1);
	}
}