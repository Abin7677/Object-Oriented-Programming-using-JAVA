package pro2;

import java.util.Scanner;

public class booking {
	String name;
	String address;
	String number;
	String email;
	String prooftype;
	String proofid;
	String a;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	double total;
	int date;
	String pr;
	int i=1;
	String re;
	String n;
	int date1;
	int date2;
	static int booked[]=new int[25];
	Scanner s=new Scanner(System.in);

	String[] c=new String[25];
	String[]e=new String[25];
	public void register() {
		


	do {
		System.out.println("Registeration");
	
		
		System.out.println("Enter your name");
		c[i]=s.next();
		System.out.println("Enter your address");
		e[i]=s.next();
		System.out.println("Enter your Contact number");
		number=s.next();
		System.out.println("Enter your Email Id");
		email=s.next();
		System.out.println("Enter proof Type");
		prooftype=s.next();
		System.out.println("Enter your proof ID");
		proofid=s.nextLine();
		booked[i]=i;
		System.out.println("Thank you for registering. Your id is "+i);
		i++;
		System.out.println("Do you want to continue book (y/n)?");
		n=s.next();
		if(n.equals("yes")==true)
		{
			book();
			System.out.println("Do you want to continue registeration (y/n)?");
			re=s.next();
			if(re.equals("yes")==true)
			{
				register();
			}
			else {
				view();
			}
		}
		else
		{
			System.out.println("Do you want to continue registeration (y/n)?");
			re=s.next();
		}
		
		
		
		
	}
	while(n.equals("yes")==true);
	}

	public void view() {
		System.out.println("\n enter the start date:");
		date1=s.nextInt();
		System.out.println("\n the end  date:");
		date2=s.nextInt();
		System.out.printf("The booking made from %d to %d are",date1,date2);
	
		System.out.println("Your details are as follows");
		System.out.println("\n====================================");
		System.out.println("room no\t\tcutomer name");
		for(int m=1;m<i;m++)
		{
			System.out.println(booked[m]+"\t\t"+c[m]);
		}
	
		System.out.println("====================================");
		
	}

	public void book() {
		String ac;
		String wifi;
		String cot;
		String cable;
		String laundry;
		double total;
		int b,c,d,e,f;
		int date;
		String pr;
		int i=1;
		
		Scanner s=new Scanner(System.in);
	
		System.out.println("booking");
		System.out.println("AC:AC/NAC:(S/D)");
		ac=s.next();
		if(ac.contentEquals("AC")==true) {
			b=1500;}
		else {b=700;}
		
		System.out.println("Cot:Single/Double:(S/D)");
		cot=s.next();
		if(cot.contentEquals("S")==true) {c=50;}
		else {c=100;}
		
		System.out.println("Cable(C/nC)");
		cable=s.next();
		if(cable.contentEquals("C")==true) {d=50;}
		else {d=0;}
		
		System.out.println("Wifi(W/nW)");
		wifi=s.next();
		if(wifi.contentEquals("W")==true) {e=200;}
		else {e=0;}
		
		System.out.println("Laundry(L/nL)");
		laundry=s.next();
		if(laundry.contentEquals("L")==true) {f=100;}
		else {f=0;}
		total=b+c+d+e+f;
		System.out.println("The total charge is Rs."+total);
		System.out.println("The services chosen are");
		System.out.println(ac);
		System.out.println(cot);
		System.out.println(cable);
		System.out.println(wifi);
		System.out.println(laundry);
		System.out.println("Enter the date for booking");
		date=s.nextInt();
		System.out.println("Do you want to proceed");
		pr=s.next();
		if (pr.equals("yes")==true)
		{
			booked[i]=1;
			
		System.out.println("Thank you your room number is"+i);
		
		}
		
		   
		}
		
	
		}
	
		

	


