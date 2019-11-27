package polymorphism;

import java.util.Scanner;

public class ploymor {
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);	
Add A=new Add();
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
A.add(a);
A.add(a,b,c);
A.add(a,b);
}
}
