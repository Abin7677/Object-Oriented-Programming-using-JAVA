package abstraction;

import java.util.Scanner;

public class Movie_abstract 
{
	public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String title=s.nextLine();
    MyMovie film=new MyMovie();
    film.setTitle(title);
    //System.out.println("The title is:"+film.getTitle());
  }
}
abstract class Movie
{
  String title;
  abstract void setTitle(String st);
    String getTitle()
    {
      return title;
    }
}
class MyMovie extends Movie
{
void setTitle(String st)
{
	System.out.println("The title is: "+st);
}
}
