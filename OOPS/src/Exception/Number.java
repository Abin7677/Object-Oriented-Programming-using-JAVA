package Exception;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
try {
	String st="abc";
	int a=Integer.parseInt(st);
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
