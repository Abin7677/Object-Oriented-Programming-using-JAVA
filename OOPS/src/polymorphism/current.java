package polymorphism;

import java.util.Scanner;

public class current {
public static void main(String arg[])
{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Bill Number");
		int bn=s.nextInt();
		System.out.println("Customer Name");
		String cn=s.next();
		System.out.println("No of calls made");
		int n=s.nextInt();
		System.out.println("Cost per call");
		double p=s.nextDouble();
		System.out.println("Bill Number");
		int b=s.nextInt();
		System.out.println("Customer Name");
		String c1=s.next();
		System.out.println("No of units consumed");
		int u=s.nextInt();
		System.out.println("Cost per unit");
		double e=s.nextDouble();
		Bill o=new Bill();
		o.bill(bn,cn);
		Telephonebill t=new Telephonebill();
		t.generatebill(n,p);

		Currentbill c=new Currentbill();
		c.generatebill(u,e);
		}
		}
		class Bill {
		public void bill(int bn,String cn)
		{
		System.out.println("Bill number:                       "+bn);
		System.out.println("Customer name:                     "+cn);
		}
		}



		class Telephonebill extends Bill {
		public void generatebill(int n,double p) {
		System.out.println("Number of calls:                   "+n);
		System.out.println("Cost per call:                     "+p);
		double cost=n*p;
		System.out.println("Telephone bill amount is:          "+cost);
		}
		}
		class Currentbill extends Bill {
		public void generatebill(int u,double e) {
		System.out.println("Number of units consumed:              "+u);
		System.out.println("Cost per unit:                         "+e);
		double amount=u*e;
		System.out.println("Current bill amount is:                "+amount);

		}
		}


