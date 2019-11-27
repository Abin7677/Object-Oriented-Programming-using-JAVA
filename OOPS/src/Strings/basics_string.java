package Strings;

import java.util.Scanner;

public class basics_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st1="now is";//first String value
String st2="the time";
String st3=" the";
int len=st1.length();//find length
char c=st1.charAt(4);
String sub=st1.substring(2,5);
Boolean start=st2.startsWith("the");
int i=st1.indexOf("is");
String con=st1.concat(st3);
String r=st2.replace("t", "T");
String sp[]=st1.split(" ");
Boolean e=st2.equals(st3);
System.out.println(len);
System.out.println(c);
System.out.println(sub);
System.out.println(start);
System.out.println(i);
System.out.println(con);
System.out.println(r);
for(int j=0;j<sp.length;j++)
{
System.out.println(sp[j]);
}
System.out.println(e);

	}

}
