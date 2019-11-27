package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern pattern = Pattern.compile(regex);//Pattern class
System.out.println("Enter Email id");
String email=s.nextLine();
Matcher em=pattern.matcher(email);//Matcher class
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
