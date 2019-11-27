package class_Object;

import java.util.Scanner;

public class booking1 {
	public static int booked[]=new int[25];
	static void  book()
	{
	String pr,ac,cot,cable,wifi,laundry;
	Scanner s=new Scanner(System.in);
	int total,b=0,c,d,e,f,i=1;
	do {
	System.out.println("Booking");
	System.out.println("Plz choose the service request");
	System.out.println("AC/non-AC(AC/nAC)");
	ac=s.next();
	if(ac.equals("AC"))
	{
	b=1000;
	}
	else
	{
	b=750;
	}

	System.out.println("Cot(Single/Double)");
	cot=s.next();
	if(cot.equals("Single"))
	{
	c=0;
	}
	else
	{
	c=350;
	}
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable=s.next();
	if(cable.equals("W"))
	{
	d=50;
	}
	else
	{
	d=0;
	}
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi=s.next();
	if(wifi.equals("W"))
	{
	e=200;
	}
	else
	{
	e=0;
	}
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=s.next();
	if(laundry.equals("L"))
	{
	f=100;
	}
	else
	{
	f=0;
	}

	total=b+c+d+e+f;
	System.out.println(ac+"room");
	System.out.println("The total charge is Rs."+total);
	System.out.println("The services chosen are");
	 
	if(c==0)
	{
	System.out.println("Single cot");
	}
	else
	{
	System.out.println("Double cot");
	}
	if(d==50)
	{
	System.out.println("Cable connection enabled");
	}
	else
	{
	System.out.println("Cable connection not enabled");
	}
	if(e==200)
	{
	System.out.println("WiFi enabled");
	}
	else
	{
	System.out.println("WiFi not enabled");
	}
	if(f==100)
	{
	System.out.println("with laundry service");
	}
	else
	{
	System.out.println("No laundry service");
	}
	System.out.println("Do you want to proceed(Yes/No)");
	pr=s.next();
	}
	while(pr.equals("No"));
	if(pr.equals("Yes"))
	{
	booked[i]=i;
	System.out.println("Thank you your room number is "+i);
	i++;

	}
	}
	void CheckStatus()
	{
	System.out.println("Enter room number");
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int f=0;
	for(int i=0;i<25;i++)
	{
	if(booked[i]==r)
	{
	f=1;
	break;
	}
	else
	{
	f=0;
	}


	}
	if(f==1)
	{
	System.out.println("room is booked");
	}
	else
	{
	System.out.println("room is not booked");
	}
	}
	}


