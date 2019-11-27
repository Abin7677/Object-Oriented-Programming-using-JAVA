package polymorphism;

public class Stud {

	public void stud(String name, int rno, String dept) {
		System.out.println(name);
		System.out.println(rno);
		System.out.println(dept);
	}

	public void stud(int mark1, int mark2, int mark3, int mark4, int mark5, int avg, int rank) {
		System.out.println("maths="+mark1);
		System.out.println("english="+mark2);
		System.out.println("science="+mark3);
		System.out.println("hindi="+mark4);
		System.out.println("mala="+mark5);
		rank=mark1+mark2+mark3+mark4+mark5;
		avg=rank/5;
		System.out.println("Average="+avg);
		if(rank>=450)
		{
			System.out.println("1st rank");
		}
		if(rank>=400&&rank<=449)
		{
			System.out.println("2nd rank");
		}
		if(rank>=350&&rank<=399)
		{
			System.out.println("3rd rank");	
		}
		if(rank>=300&&rank<=349)
		{
			System.out.println("4th rank");
		}
		if(rank>=250&&rank<=299)
		{
			System.out.println("5th rank");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
