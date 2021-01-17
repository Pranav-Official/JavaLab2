import java.io.*;
import java.util.Scanner;
public class PROGRAM1
{
  public static void main(String[] args)
  {
	  Scanner sc= new Scanner(System.in);
	  double r;
	  int l,b;
	  System.out.println( "Enter the radius of circle = ");
	  r=sc.nextDouble();
	  System.out.println("Enter the length and breadth of Rectangle = ");
	  l=sc.nextInt();
	  b=sc.nextInt();
	  Formula obj=new Formula();
	  obj.Area(r);
	  obj.Area(l,b);
	  
  }
}

class Formula
{
	void Area(double r)
	{
		double pi=3.1415;
		double area=pi*r*r;
		System.out.println("Area Of the Circle ="+area);
	}
	void Area(int l,int b)
	{
		int area=l*b;
		System.out.println("Area ofthe rectangle = "+area);
	}
}