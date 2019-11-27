package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Santa_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enetr th guest name:");
String st=s.nextLine();
System.out.println("Enetr the residence host:");
String st1=s.nextLine();
System.out.println("Enetr th letters in a pile:");
String st2=s.nextLine();
int flag=0;
String str=st.concat(st1);

char tempArray[] = st2.toCharArray(); 
Arrays.sort(tempArray); 
System.out.println(tempArray);
char temp1Array[] = str.toCharArray(); 
Arrays.sort(temp1Array); 
System.out.println(temp1Array);
if(Arrays.equals(temp1Array,tempArray))
{
	flag=1;
}
else
{
	flag=0;
}
if(flag==1)
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
	}

}
