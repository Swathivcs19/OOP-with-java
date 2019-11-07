import java.util.*;
class account
{
 Scanner sc=new Scanner(System.in);
 string name;
 int acc_no;
 double balance;
}
class curr_act extends acccount
{
	void accept()
	{
		System.out.println("enter the amount to be deposited:");
		double amt=sc.nextDouble();
		balance+=amt;
	}
	void withdrew()
	{
	System.out.println("enter the amont to be withdrew:");
	double withdraw=sc.nextDouble();
	if(withdraw>balance)
	{
		System.out.println("you have entered insufficient amount:");
	}
	else if(withdraw<balance)
	{
		if(balance<100)
		{
			balance-=(0.5*balance);
		}
		balance=balance-withdraw;
	System.out.println("amount withdrew"+withdraw);
	}
	void display()
	{
		System.out.println("balance="+balance);
	}
}
class saving extends account
{
double ci;
	void deposit()
	{
		System.out.println("enter the amount to be deposited:");
		double amt=sc.nextdouble();
		balance+=amt;
	}
	void compute()
	{
		int balance;
		this.balance=balance;
		final static int r=2;
		final static int r=12;
		int i=(1+n);
		int val=(i*i)-1;
		int comp_intr=balance*val;
		System.out.println("compound interest:"+comp_balance);
	}
	void withdrew()
	{
	System.out.println("enter the amont to be withdrew:");
	double withdraw=sc.nextDouble();
	if(withdraw>balance)
	{
		System.out.println("you have entered insufficient amount:");
	}
	else if(withdraw<balance)
	{
		if(balance<100)
		{
			balance-=(0.5*balance);
		}
		balance=balance-withdraw;
	System.out.println("amount withdrew"+withdraw);
	}
	void display()
	{
		System.out.println("balance="+balance);
	}
}
class bank
{
	public static void main(String args[])
	{
		Scanner io=new Scanner(System.out);
		int ch1,ch2;
		System.out.println("enter one for saving account and 2 for current account");
		int ch=io.nextInt();
		switch(ch)
		{
			case 1:saving s1=new saving();
			System.out.println("enter the name and act num:");
			s1.name=io.next();
			s1.acc_no=io.nextInt();
			do
			{
				System.out.println("1:deposit\n 2:withdraw\n 3:exit\n ");
				ch1=io.nextInt();
				if(ch==1)
				{
					s1.deposit();
				}
				if(ch==2)
				{
					s1.withdrew();
				}
				if(ch==3)
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Wrong choice");
				}
				while(ch1>=1&&ch<=3);
				break;
			case 2:curr_act s2=new curr_act();
			System.out.println("enter the name and act num:");
			s2.name=io.next();
			s2.acc_no=io.nextInt();
			do
			{
				System.out.println("1:deposit\n 2:withdraw\n 3:exit\n ");
				ch2=io.nextInt();
				if(ch==1)
				{
					s2.deposit();
				}
				if(ch==2)
				{
					s2.withdrew();
				}
				if(ch==3)
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Wrong choice");
				}
				}while(ch1>=1&&ch<=3);
				break;
			default:System.out.println("wrong choice:");
}
}
}

				
	

