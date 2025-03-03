package ca.mohaghegh.navid;

public class Triangle
{
	private Point pA;
	private Point pB;
	private Point pC;
	
	public Triangle(Point pA, Point pB, Point pC)
	{
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	public Point getA()
	{
		return pA;
	}

	public Point getB()
	{
		return pB;
	}

	public Point getC()
	{
		return pC;
	}

	public void setA(Point pA)
	{
		this.pA = pA;
	}

	public void setB(Point pB)
	{
		this.pB = pB;
	}

	public void setC(Point pC)
	{
		this.pC = pC;
	}
	
	@Override
	public String toString()
	{
		return "Triangle [pA=" + pA + ", pB=" + pB + ", pC=" + pC + "]";
	}

	
	
	public static void main(String[] args)
	{
		Point a = new Point(-1.0, -1.0, -3.0);
		Point b = new Point(0.0, 1.0, -3.0);
		Point c = new Point(2.0, 0.0, -3.0);
		Triangle tri = new Triangle(a, b, c);
		System.out.println(tri);
		System.out.println();
		
		Point d = tri.getA();
		boolean sameObj = a == d;
		System.out.println(sameObj);
		tri.setC(d);
		System.out.println(tri);
		System.out.println();
		
		a.setX(0.5);
		a.setY(6.0);
		a.setZ(2.0);
		System.out.println(tri);
		System.out.println();
	}
}
