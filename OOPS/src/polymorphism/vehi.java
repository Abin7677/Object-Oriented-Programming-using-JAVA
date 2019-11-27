package polymorphism;

public class vehi {

	public void details(String c, int sp, int st, int w, String d) {
		System.out.println("Bike Details");
		System.out.println("Color :" +c);
		System.out.println("Maximum Speed :" +sp);
		System.out.println("Seats :" +st);
		System.out.println("Wheels :" +w);
		System.out.println("Disk Break :" +d);
	}
}
class bike extends vehi{
	public void details(String c1, int sp1, int st1, int w1, int dr, String a) {
		// TODO Auto-generated method stub
		System.out.println("Car Details");
		System.out.println("Color :" +c1);
		System.out.println("Maximum Speed :" +sp1);
		System.out.println("Seats :" +st1);
		System.out.println("Wheels :" +w1);
		System.out.println("Doors :" +dr);
		System.out.println("AC :" +a);
	}

}
