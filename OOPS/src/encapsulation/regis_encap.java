package encapsulation;

import java.util.Scanner;

public class regis_encap {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	Employee e=new Employee();
	Display d=new Display();
	System.out.println("Enter a name");
	e.setName(s.next());
	System.out.println("Enter address");
	e.setAddress(s.next());
	System.out.println("Enter Contact Number");
	e.setNumber(s.next());
	System.out.println("Enter Email");
	e.setEmail(s.next());
	System.out.println("Enter proof type");
	e.setProofType(s.next());
	System.out.println("Enter ID");
	e.setID(s.next());
	d.disp(e.getName(),e.getAddress(),e.getNumber(),e.getEmail(),e.getProofType(),e.getID());
}
}
