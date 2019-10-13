import java.util.*;
import java.lang.*;
class quad
{
	public static void main(String args[])
	{
	int a,b,c;
	double d;
	double r1,r2;
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the co-efficients of ax^2+bx+c=0");
	a=ip.nextInt();
	b=ip.nextInt();
	c=ip.nextInt();
	
	d=(b*b)-(4*a*c);
	if(d>0)
	{
	System.out.println("roots are real &unequal");
	r1=(-b+Math.sqrt(d))/(2*a);
	r2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("root1:"+r1+"root2:"+r2);
	}
	else if(d==0)
	{
	r1=(-b+Math.sqrt(d))/(2*a);
	r2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("roots are real &equal");
	System.out.println("root1:"+r1+"root2:"+r2);
	}
	else
	{
	System.out.println("roots are imaginary");
	}
}
}
	