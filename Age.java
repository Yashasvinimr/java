import java.util.*;
class Wrongage extends Exception
{
	int age;
	Wrongage(int a)
 	{
    		age=a;
  	}
 	public String toString()
	{
		return "Entered Wrong age is ["+age+"]";
	}

}

class Father 
{
	int f;
	Scanner in=new Scanner(System.in);
	Father()
	{

		System.out.println("Enter father age ");
		f=in.nextInt();
	}
	void checkage() throws Wrongage
	{
	if(f<0)
	{
		throw new Wrongage(f);
	}
	System.out.println("Father age positive");
	}
}


class Son extends Father
{
	int s;
	Scanner in=new Scanner(System.in);
	Son()
	{
	super();
	System.out.println("Enter son age ");
	s=in.nextInt();
	}

	void checkages() throws Wrongage
	{
		super.checkage();
		if(s<0)
		{
			throw new Wrongage(f);
		}
	System.out.println("Son age positive");
}


void checkage() throws Wrongage
{
	if(s>f||s==f)
	{
		throw new Wrongage(s);
	}
	System.out.println("Father-Son age correct");
	}

}


class Age
{
	public static void main(String args[])
	{

		int f,s;

		Father fath=new Father();

		Father r;
		r=fath;
	try
	{
	r.checkage();
}
catch(Wrongage e)	
{
	System.out.println("Father age wrong\n"+e);
}
Son sn=new Son();
r=sn;

try
{

	sn.checkages();
	r.checkage();
}
catch(Wrongage e)
	{
	System.out.println("Son age wrong\n"+e);
	}
}
}