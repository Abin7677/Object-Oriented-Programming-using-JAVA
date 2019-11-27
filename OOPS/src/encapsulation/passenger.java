package encapsulation;

import java.util.Scanner;

public class passenger {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int a,i=1,r=1;
		Ticket1 t=new Ticket1();

		System.out.println("Enter price of ticket");
		t.setPrice(s.nextInt());
		System.out.println("Enter no of person");
		t.setPer(s.nextInt());
		a=t.getPer();
		do {
		System.out.printf("Enter Details Of Person %d\n",i);i++;
		System.out.println("Enter name");
		t.setName(s.next());
		System.out.println("Enter gender(F/M)");
		t.setG(s.next());
		System.out.println("Enter age");
		t.setAge(s.nextInt());
		a--;
		}while(a>0);
		t.ticket(t.getPer(),t.getPrice());
		while(r<=t.getPer())
		{
		double total=t.ticket1(t.getAge(),t.getG(),t.getPer(),t.getPrice());
		if(r==t.getPer()) {
		System.out.printf("Total Amount=%.1f",total);
		break;
		}
		r++;
		}
		}
}
		
		class Ticket1 {
		int price;
		int per;int i=1,j=0;
		String name;
		String g;
		int age;
		double tot=0,sum=0;
		public int getPrice() {
		return price;
		}
		public void setPrice(int price) {
		this.price = price;
		}
		public int getPer() {
		return per;
		}
		public void setPer(int per) {
		this.per = per;
		}
		public int getI() {
		return i;
		}
		public void setI(int i) {
		this.i = i;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getG() {
		return g;
		}
		public void setG(String g) {
		this.g = g;
		}
		public int getAge() {
		return age;
		}
		public void setAge(int age) {
		this.age = age;
		}
		public void ticket(int per, int price) {
		// TODO Auto-generated method stub
		System.out.printf("Ticket details are....\n");
		System.out.printf("Number Of Passengers:%d\n",per);
		System.out.printf("Price Of Ticket:%d\n",price);
		}
		double ticket1(int age, String g,int per,int price) {

		j++;
		tot=0;
		double n=.25,q=.10,u=.50;
		if(age<16)
		{
		tot=(double)sum+(price-(price*u));
		sum=tot;
		return tot;
		}
		else if(g.equals("F")==true&&age>=16)
		{
		tot=sum+(price-price*q);
		sum=tot;
		return tot;
		}
		else if(age>64)
		{
		tot=sum+(price-price*n);
		sum=tot;
		return tot;
		}
		else
		{
		tot=sum+price;
		sum=tot;
		return tot;
		}
		}  
		}
