import java.io.*;
public class TRIANGLE 
{
  public TRIANGLE()
  {
	 double p,sp,a;
	  double l1=3,l2=4,l3=5;
	  p=l1+l2+l3;
	  sp=p/2;
	  a=Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
	  System.out.println("Area of the TRIANGLE is %.3f sq units ."+a);
	  
  }
  
  public static void main(String[] args)
  {
	  TRIANGLE ob =new TRIANGLE();
  }
}
