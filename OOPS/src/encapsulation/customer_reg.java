package encapsulation;

import java.util.Scanner;

public class customer_reg {
public static void main(String arg[])
{
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	Customer c=new Customer();
	//Disp d=new Disp();
	do 
	{
	System.out.println("Enter a name");
	c.setName(s.next());
	System.out.println("Enter address");
	c.setAddress(s.next());
	System.out.println("Enter Contact Number");
	c.setNumber(s.next());
	System.out.println("Enter Email");
	c.setEmail(s.next());
	System.out.println("Enter proof type");
	c.setProofType(s.next());
	System.out.println("Enter ID");
	c.setID(s.next());
	if(c.getName()==null)
	{
	System.out.println("invalid Name");
	}
	if(c.getAddress()==null)
	{
	System.out.println("invalid Address");
	}
	if(c.getNumber()==null)
	{
	System.out.println("invalid Contact Number");
	}
	if(c.getEmail()==null)
	{
	System.out.println("invalid E-mail");
	}
	if(c.getProofType()==null)
	{
	System.out.println("invalid Proof Type");
	}
	if(c.getID()==null)
	{
	System.out.println("invalid Proof ID");
	}
	}
	while(c.getName()==null || c.getAddress()==null || c.getNumber()==null || c.getEmail()==null || c.getProofType()==null || c.getID()==null);
	if(c.getName()!=null && c.getAddress()!=null &&c.getNumber()!=null &&c.getEmail()!=null && c.getProofType()!=null && c.getID()!=null)
	{
c.display(c.getName(),c.getAddress(),c.getNumber(),c.getEmail(),c.getProofType(),c.getID());
}
}
}
