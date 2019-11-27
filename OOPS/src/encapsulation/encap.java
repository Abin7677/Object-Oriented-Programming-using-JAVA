package encapsulation;

import java.util.Scanner;

public class encap {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	Student st=new Student();
	System.out.println("Enter name");
	st.setName(s.next());
	System.out.println("Enter id");
	st.setId(s.nextInt());
	System.out.println("Details");
	System.out.println("name =" +st.getName());
	System.out.println("id =" +st.getId());
}
}
