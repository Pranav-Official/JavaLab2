import java.io.*;
import java.util.Scanner;
public class AREA 
{

	  int area;
	  AREA(int l,int b)
	  {
		  area=l*b;
	  }
	  int rArea()
	  {
		return this.area;  
	  }
  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle .");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		AREA obj=new AREA(length,breadth);
		System.out.println("Area of the rectangle is %d sq units."+obj.rArea());
	}
}
