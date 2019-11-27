package Strings;

import java.util.Scanner;

public class rev_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

String st=s.nextLine();
String a[]=st.split(" ");;
for(int i=0;i<a.length;i++)
{
if(i%2!=0)
{
	int l=a[i].length();
	for(int j=l-1;j>=0;j--)
	{
		System.out.print(a[i].charAt(j));
	}
	System.out.println(" ");
}
else
{
	System.out.print(a[i]+" ");
}
	}

}}
