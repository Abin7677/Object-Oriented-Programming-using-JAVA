package Class;

import java.util.Scanner;

public class operations {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("1)mod\n2)div\n)3)mul\n)4)sub\n5)add");
		int n=s.nextInt();
		oper o=new oper(a,b);
		switch(n)
		{
		case 1:
		    oper.add(a,b);
		    break;
		case 2:
		    oper.sub(a,b);
		    break;
		case 3:
			oper.mul(a, b);
			break;
		case 4:
			oper.div(a,b);
			break;
		case 5:
		    oper.mod(a,b);
		    break;
		default:
			System.out.println("invalid");
		}
	}
	}
	class oper{
		int a;int b;
		public oper(int a,int b)
		{
			a=a;
			b=b;
					}
		public static void mod(int a, int b) {
			
			System.out.printf("mod->%d",a%b);
		}
		public static void div(int a, int b) {
			
			System.out.printf("div->%d",a/b);
		}
		public static void mul(int a, int b) {
			
			System.out.printf("mul->%d",a*b);
		}
		public static void sub(int a, int b) {
		
			System.out.printf("sub->%d",a-b);
		}
		public static void add(int a,int b) {
			
			System.out.printf("add->%d",a+b);
		}
	}

