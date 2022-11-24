import java.util.Scanner;
class student{
void display(String name, String usn)
{
	
	System.out.println("Enter USN of student:"+usn);
	System.out.println("Enter name of the student:"+name);
}
void calculatesgpa(double[] marks, double[] credits, int number)
{
	double gradepoints[]=new double[number];
	double sgpa,sum=0,tnum=0;
	for(int i=0;i<number;i++)
	{
		if(marks[i]>=90)
		gradepoints[i]=10;
		else if((marks[i]>=80)&&(marks[i]<90))
		gradepoints[i]=9;
		else if((marks[i]>=70)&&(marks[i]<80))
		gradepoints[i]=8;
		else if((marks[i]>=60)&&(marks[i]<70))
		gradepoints[i]=7;
		else if((marks[i]>=50)&&(marks[i]<60))
		gradepoints[i]=6;
		else if((marks[i]>=40)&&(marks[i]<50))
		gradepoints[i]=4;
		else
		gradepoints[i]=0;
	}
	for(int i=0;i<number;i++)
		{
			sum+=credits[i]*gradepoints[i];
		}
	for(int i=0;i<number;i++)
		{
			tnum+=credits[i];
		}
	sgpa=sum/tnum;
	System.out.println("SGPA is "+sgpa);
}	
}
class sgpa{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter name and usn of student:");
	String name=s.next();
	String usn=s.next();
	student s1=new student();
	System.out.println("Enter the number of courses");
	int number=s.nextInt();
	double credits[]=new double[number];
	double marks[]=new double[number];
	for(int i=0;i<number;i++)
	{
		System.out.print("Credit of subject "+(i+1) +" : ");
		credits[i]=s.nextDouble();
		System.out.print("Marks of subject "+(i+1) +" : ");
		marks[i]=s.nextDouble();
	}
	s1.display(name,usn);
	s1.calculatesgpa(marks,credits,number);
}
}

		