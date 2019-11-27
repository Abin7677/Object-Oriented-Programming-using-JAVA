package polymorphism;

public class override {
public static void main(String arg[])
{
	//abc o=new abc();
	//o.disp();
	demo obj=new demo();
	obj.disp();
}
}
class abc
{
	public void disp()
	{
		System.out.println("Parent class");
	}
}
class demo extends abc
{
	public void disp()
	{
		super.disp();
		System.out.println("Child class");
	}
}