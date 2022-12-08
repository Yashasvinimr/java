abstract class Shape
{
	double a,b;
	Shape(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract void printArea();
}
class rectangle extends Shape
{
	rectangle(int x, int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of rectangle is"+(a*b));
	}
}
class triangle extends Shape
{
	triangle(int x, int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of triangle is"+(0.5*a*b));
	}
}
class circle extends Shape
{
	circle(int x, int y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of circle is"+(3.14*a*a));
	}
}
class shapearea
{
	public static void main(String args[])
	{
		rectangle r1=new rectangle(10,20);
		triangle t1=new triangle(5,20);
		circle c1=new circle(4,5);
		Shape r;
		r=r1;
		r.printArea();
		r=t1;
		r.printArea();
		r=c1;
		r.printArea();
	}
}