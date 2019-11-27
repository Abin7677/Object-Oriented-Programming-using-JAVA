package Strings;

import java.util.Scanner;

public class count_alls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.nextLine();
int up=0,lc=0,vowels=0,consonants=0,digits=0,spaces=0,sp=0;
int l=st.length();
for(int i=0;i<l;i++)
{
	char ch=st.charAt(i);
if(ch>='A'&&ch<='Z')	
{
	++up;
}
else if((ch>='a'&&ch<='z'))
{
	++lc;
}
else if((ch == 'a') || (ch == 'e') || (ch == 'i')|| (ch == 'o') || (ch == 'u')||(ch == 'A') || (ch == 'E') || (ch == 'I')|| (ch == 'O') || (ch == 'U'))
{
++vowels;
continue;
}
else if( ch >= '0' && ch <= '9')
{
++digits;
}
else if (ch ==' ')
{
++spaces;
}
else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='('||ch==')')
{
++sp;	
}
}
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + (vowels));
System.out.println("Digits: " + digits);
System.out.println("White spaces: " + spaces);
System.out.println("Special characters: " + sp);
System.out.println("Upper case: " + up);
System.out.println("Lower case: " + lc);
}
}
