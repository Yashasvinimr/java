import java.util.*;
import java.lang.*;
class account
{
	public String accname;
	public double accno;
	public int acctype;
	public double balance;
	public void getdata(String name,double no,int type,double bal)
	{

		accname=name;
		accno=no;
		acctype=type;
		balance=bal;
	}
}
class savings extends account
{
	public void deposit(double amt)
	{
		balance=balance+amt;
		System.out.println(balance);
	}
	public void withdraw(double amt)
	{
		balance=balance-amt;
		System.out.println(balance);
	}
	public void interest(int time,int no)
	{
		double intr=balance*(1+6/no);
		intr=Math.pow(intr,(time*no));
		System.out.println("Intertest calculated is"+intr);

		balance=balance+intr;
		System.out.println("The new balance is"+balance);
	}
}
class current extends account
{
	public void deposit(double amt)
	{
		balance=balance+amt;
		System.out.println(balance);
	}
	public void withdraw(double amt)
	{
		balance=balance-amt;
		System.out.println(balance);
		check(balance);
	}
	public void check(double amt)
	{
		if(amt<10000)
		{
			balance =balance-500;
			System.out.println("Insufficient Balance"+balance);

		}
	}

}
class main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int temp=1;
		while(temp==1)
		{
			double amt=0;
			System.out.println("Enter name");
			sc.next();
			String name=sc.nextLine();
			System.out.println("Enter accno");
			double no=sc.nextDouble();
			System.out.println("Enter acctype\n0 for Savings\n1 for Current");
			int type=sc.nextInt();
			do
			{
				System.out.println("Enter balance");

				amt=sc.nextDouble();
			}
			while(type==1 && amt<10000);
			if(type==0)
			{
				savings s=new savings();
				s.getdata(name,no,type,amt);
				System.out.println("\n1.Deposit\n2.Withdraw\n3.Interest");
				int temp3=sc.nextInt();
				if(temp3==1)
				{
					System.out.println("Enter Amoumt");
					double amt1=sc.nextDouble();
					s.deposit(amt1);
				}
				else if(temp3==2)
				{
					System.out.println("Enter Amoumt");
					double amt1=sc.nextDouble();
					s.withdraw(amt1);
				}
				else if(temp3==3)
				{
				System.out.println("Enter time period");	
				int tp=sc.nextInt();
				System.out.println("Enter no of times");
				int nof=sc.nextInt();
				s.interest(tp,nof);
				}
			}
			else if(type==1)
			{
				current c=new current();
				c.getdata(name,no,type,amt);
				System.out.println("\n1.Deposit\n2.Withdraw");
				int temp3=sc.nextInt();
				if(temp3==1)
				{
					System.out.println("Enter Amoumt");
					double amt1=sc.nextDouble();
					c.deposit(amt1);
				}
				else if(temp3==2)
				{
					System.out.println("Enter Amoumt");
					double amt1=sc.nextDouble();
					c.withdraw(amt1);

				}

			}
			System.out.println("To continue 1 else 0");
			temp=sc.nextInt();
		}
	}
}