package Exception;

import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
try {
	String st=null;
	System.out.println(st.length());
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
