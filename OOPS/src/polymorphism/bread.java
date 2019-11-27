package polymorphism;

import java.util.Scanner;

public class bread {
	public static void main(String arg[])
	{
	 Scanner s=new Scanner(System.in);
	    System.out.println("1.Bread only");
	    System.out.println("2.Bread+jam");
	    System.out.println("3.Bread+jam+butter");
	    System.out.println("Enetr your choice:");
		int choice=s.nextInt();
	    calorie ca=new calorie();
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Enetr the slice of bread");
		    int b=s.nextInt();
	    	ca.cal(b);
	    	break;
	    case 2:
	    	System.out.println("Enetr the slice of bread");
		    int b1=s.nextInt();
	    	System.out.println("Enetr the teaspoon of jam");
		    int j=s.nextInt();
	    	ca.cal(b1,j);
	    	break;
	    case 3:
	    	System.out.println("Enetr the slice of bread");
		    int b2=s.nextInt();
		    System.out.println("Enetr the teaspoon of jam");
		    int j1=s.nextInt();
	    	System.out.println("Enetr the teaspoon of butter");
		    int bu=s.nextInt();
	    	ca.cal(b2,j1,bu);
	    	break;
	    }
}
}
