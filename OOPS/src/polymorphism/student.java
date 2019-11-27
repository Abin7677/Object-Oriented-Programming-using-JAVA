package polymorphism;

import java.util.Scanner;

public class student {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	Stud st=new Stud();
	String name=s.next();
	int rno=s.nextInt();
	String dept=s.next();
	int mark1=s.nextInt();
	int mark2=s.nextInt();
	int mark3=s.nextInt();
	int mark4=s.nextInt();
	int mark5=s.nextInt();
	int avg = 0;
	int rank = 0;
	st.stud(name,rno,dept);
	st.stud(mark1,mark2,mark3,mark4,mark5,avg,rank);
}
}
