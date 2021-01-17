import java.io.*;

class Superclass
{
	void display1()
	{
		System.out.println("This is Superclass.");
	}
}

class Subclass extends Superclass
{
	void display2()
	{
		System.out.println("This is Subclass.");
	}
}

public class PROGRAM5
{
  public static void main(String[] args)
  {
	  Superclass obj1=new Superclass();
	  obj1.display1();
	  
	  Subclass obj2=new Subclass();
	  obj2.display2();
	  
	  obj2.display1();
  }
}
