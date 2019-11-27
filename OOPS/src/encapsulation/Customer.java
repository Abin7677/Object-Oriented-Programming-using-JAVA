package encapsulation;

public class Customer {
String name;
String address;
String number;
String email;
String proofType;
String ID;
public String getName() {
	return name;
}
public boolean setName(String name)
{
    if (name.matches("^[a-zA-Z]*$"))
    {
        this.name=name;
        return true;
    }
	return false;
}
public String getAddress() {
	return address;
}
public boolean setAddress(String address)
{
    if (address.matches("^[a-zA-Z]*$"))
    {
        this.address=address;
        return true;
    }
	return false;
}
public String getNumber() {
	return number;
}
public boolean setNumber(String contact)
{
    if (contact.matches("^[0-9]*$"))
    {
        this.number=contact;
        return true;
    }
	return false;
}
public String getEmail() {
	return email;
}
public boolean setEmail(String email)
{
    if (email.contains("@"))
    {
        this.email=email;
        return true;
    }
	return false;
}
public String getProofType() {
	return proofType;
}
public boolean setProofType(String proofType)
{
    if (proofType.matches("^[a-zA-Z]*$"))
    {
        this.proofType=proofType;
        return true;
    }
	return false;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public void display(String name, String address, String number, String email, String proofType, String ID) {
	int a[]=new int[25];
	int i=1;
	System.out.println("Registration");
	System.out.println();
	System.out.println(getName());
	System.out.println(getAddress());
	System.out.println(getNumber());
	System.out.println(getEmail());
	System.out.println(getProofType());
	System.out.println(getID());
	 System.out.println("Your id is "+i);
	 i++;
	System.out.println("Registration succssful");
}
}
