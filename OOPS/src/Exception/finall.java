package Exception;

public class finall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String st="abc";
			int a=Integer.parseInt(st);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Pgm closed");
		}
	}

}
