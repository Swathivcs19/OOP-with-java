import java.util.*;
import java.lang.*;
import java.io.*;
class book
{
	String name;
	String author;
	float price;
	int num;
	book()
	{}
	book(String _name,String _author,float _price)
	{
	name=_name;
	author=_author;
	price=_price;
	}
void getdata()
{
	Scanner p=new Scanner(System.in);
	System.out.println("enter the name:");
	name=p.next();
	System.out.println("enter the author:");
	author=p.next();
	System.out.println("enter the price:");
	price=p.nextFloat();
	System.out.println("enter the num");
	num=p.nextInt();
}
public String toString()
{
	return(name+""+author+""+price+""+num);
}
}
class demo
{
public static void main(String args[])
{
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the num of books:");
	int n=ip.nextInt();
	book b[]=new book[n];
	for(int i=0;i<n;i++)
	{
		b[i]=new book();
		b[i].getdata();
		System.out.println(b[i]);
	}
}
}
	