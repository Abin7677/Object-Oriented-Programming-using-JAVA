package encapsulation;

public class Display extends Employee{

	public void disp(String name, String address, String number, String email, String proofType, String id) {
		System.out.println("Registration");
		System.out.println();
		System.out.println("name       = "+getName());
		System.out.println("address    = "+getAddress());
		System.out.println("number     = "+getNumber());
		System.out.println("email      = "+getEmail());
		System.out.println("proof type = "+getProofType());
		System.out.println("id         = "+getID());
		System.out.println("Registration succssful");
	}
}