package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Pattern p=Pattern.compile("..a");
Matcher m=p.matcher("Maa");
Boolean b=m.matches();
System.out.println(b);
	}

}
