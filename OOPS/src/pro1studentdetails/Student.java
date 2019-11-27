package pro1studentdetails;

import java.util.Scanner;

public class Student {
	Scanner s=new Scanner(System.in);
	String name;
	String age;
	String address;
	String number;
	String email;
	String rollno;
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	double total;


	public void detail() {
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter the age");
		age=s.nextLine();
		System.out.println("Enter your address");
		address=s.nextLine();
		System.out.println("Enter your Contact number");
		number=s.nextLine();
		System.out.println("Enter your Email Id");
		email=s.nextLine();
		System.out.println("Enter your proof rollno");
		rollno=s.nextLine();
		
		
	}


	public void marks() {
		System.out.println("Enter your marks for sub1");
		sub1=s.nextInt();
		System.out.println("Enter your marks for sub2");
		sub2=s.nextInt();
		System.out.println("Enter your marks for sub3");
		sub3=s.nextInt();
		System.out.println("Enter your marks for sub4");
		sub4=s.nextInt();
		total=sub1+sub2+sub3+sub4;
	
		
	}


	public void rank() {
	if(total>90&&total<100)
	{
		System.out.println("1st rank");
	}
	else if(total>80&&total<=90)
	{
		System.out.println("2nd rank");
	}
	else if(total>70&&total<=80)
	{
		System.out.println("3rd rank");
	}
	else if(total>70&&total<=80)
	{
		System.out.println("4th rank");
	}
	else if(total>60&&total<=70)
	{
		System.out.println("5th rank");
	}
	else
	{
		System.out.println("no rank");
	}
		
	}
	

}
