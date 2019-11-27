package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String name1="[A-Z][a-z]*";
String name2="[A-Z][a-z]*";
String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
String reg="^[0-9]*";
String ran="^[0-9]*";
String yea="^[0-9]*";
String dep="(.[a-zA-Z-]+)*";
Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern pattern=Pattern.compile(name1);
Pattern pattern1=Pattern.compile(name2);
Pattern pattern2=Pattern.compile(regex);
Pattern pattern3=Pattern.compile(reg);
Pattern pattern4=Pattern.compile(ran);
Pattern pattern5=Pattern.compile(yea);
Pattern pattern6=Pattern.compile(dep);
System.out.println("Enter First name");
String name=s.nextLine();
Matcher fname=pattern.matcher(name);//Matcher class
System.out.println("Enter Last name");
String nme=s.next();
Matcher lname=pattern1.matcher(nme);
System.out.println("Enter email");
String email=s.next();
Matcher em=pattern2.matcher(email);
System.out.println("Enter Register number");
String reg1=s.next();
Matcher regno=pattern3.matcher(reg1);
System.out.println("Enter rank");
String r=s.next();
Matcher rank=pattern4.matcher(r);
System.out.println("Enter Year");
String y=s.next();
Matcher year=pattern5.matcher(y);
System.out.println("Enter Department");
String dpt=s.next();
Matcher dept=pattern6.matcher(dpt);
if(fname.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Invalid name");
}
if(lname.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Inalid  last name");
}
else if(em.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Invalid Email id");
}
if(regno.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Invalid Register number");
}
if(rank.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Invalid rank");
}
if(year.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Invalid year");
}
if(dept.matches()==false)//matches is a result set for matcher class
{
	System.out.println("Invalid dept");
}
if((fname.matches()&&lname.matches()&&em.matches()&&regno.matches()&&rank.matches()&&year.matches()&&dept.matches())==true)
{
	System.out.println("All are valid");
	System.out.println("Do you want continue(yes/no)");
	String str=s.next();
	if(str.contentEquals("yes")==true)
	{
	System.out.println("Enter Password");
	String password=s.next();
	Matcher mtch=pswNamePtrn.matcher(password);
	if(em.matches())//matches is a result set for matcher class
	{
		System.out.println("Valid Email id");
	}
	else {
		System.out.println("Invalid Email id");
		}
	if(mtch.matches())
	{
		System.out.println("Correct Password");
	}
	else
	{
		System.out.println("Invalid Password");
	}
	}
}
	}

}
