package class_Object;

import java.util.Scanner;

public class Reg {
	String name;
	String address;
	String number;
	String email;
	String prooftype;
	String proofid;
	String a,b;
	String n;
	double total;
	public static void reg()
	{
	String name;
	String address;
	String number;
	String email;
	String prooftype;
	String proofid;
	String ac;
	String wifi;
	String cot;
	String cable;
	String laundry;
	int b,c,d,e,f;
	String n;
	int i=1;

	Scanner s=new Scanner(System.in);

	System.out.println("Enter your name");
	name=s.nextLine();
	System.out.println("Enter your address");
	address=s.nextLine();
	System.out.println("Enter your Contact number");
	number=s.nextLine();
	System.out.println("Enter your Email Id");
	email=s.nextLine();
	System.out.println("Enter proof Type");
	prooftype=s.nextLine();
	System.out.println("Enter your proof ID");
	proofid=s.nextLine();
	System.out.println("Thank you for registering. Your id is 1");
	System.out.println("Do you want to continue registration (y/n)?");
	n=s.next();
	if(n.equals("Yes")==true)
	{

	}

	ac=s.nextLine();
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
	double total=b+c+d+e+f;
	System.out.println("The total charge is Rs."+total);
	System.out.println("The services chosen are");
	System.out.println(ac);
	System.out.println(cot);
	System.out.println(cable);
	System.out.println(wifi);
	System.out.println(laundry);
	System.out.println("Do you want to proceed");
	String pr=s.next();
	if (pr.equals("yes")==true)
	{
		int[] booked = null;
		booked[i]=1;
	System.out.println("Thank you your room number is"+i);
	i=i+1;
	}
	//break;
	   
	}
}
