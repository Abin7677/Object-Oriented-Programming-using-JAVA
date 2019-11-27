package Threads;

public class Thread_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c t=new c();
t.start();
	}

}
class c extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
			System.out.println("Thread is going to sleep "+i+" time");
			
			Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread Running "+i+" time");
			System.out.println(i);
		}
	}
}
