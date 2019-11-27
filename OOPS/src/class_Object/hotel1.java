package class_Object;

import java.util.Scanner;

public class hotel1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		booking1 b=new booking1();
		String str;
		do
		{
		System.out.println("Menu");
		System.out.println("1.book\n2.Check status\n3.exit");
		System.out.println("Enter your choice");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		b.book();
		break;
		case 2:
		b.CheckStatus();
		break;
		case 3:
		System.out.println("Invalid");
		break;
		}
		System.out.println("Do you want to continue?");
		s.nextLine();
		str=s.nextLine();
		}while(str.equals("yes")||str.equals("Yes")||str.equals("YES"));

		}
		}


