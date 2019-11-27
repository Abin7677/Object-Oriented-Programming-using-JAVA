package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class flame {
private static final String ObjectArrays = null;

public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
			String st=s.nextLine();
			String st1=s.nextLine();
			char str[]=st.toCharArray();
			for(int i=0;i<st.length();i++)
			{
				if(str[i]>='a'&&str[i]<='z')
				{
					str[i]=(char)((int)str[i]-32);
				}
			}
			for(int i=0;i<str.length;i++)
			{
				System.out.print(str[i]);
			}
			
			char str1[]=st1.toCharArray();
			for(int i=0;i<st1.length();i++)
			{
				if(str1[i]>='a'&&str1[i]<='z')
				{
					str1[i]=(char)((int)str1[i]-32);
				}
			}
			for(int i=0;i<str1.length;i++)
			{
				//System.out.print();
				System.out.print(str1[i]);
			}
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<str1.length;j++)
				{
					if(str[i]!=str1[j])
					{
						count++;
					}
					if(i==j)
					{
						System.out.println(count);
					}
				}
			}System.out.println();
			System.out.println(count);
			


}
}
