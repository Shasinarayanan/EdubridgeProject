package shapes;

public class Trapezoid extends TwoD {
	private int h;

	public Trapezoid()

	{

	}

	public Trapezoid(ShapeColor sc, int a, int b, int c, int d, int h)

	{

		super(sc, a, b, c, d);

		this.h = h;

	}

	public int getA()

	{

		return a;

	}

	public int getB()

	{

		return b;

	}

	public int getC()

	{

		return c;

	}

	public int getD()

	{

		return d;

	}

	public int getHeight()

	{

		return h;

	}

	public void set(ShapeColor sc, int a, int b, int c, int d)

	{

		this.sc = sc;

		this.a = a;

		this.b = b;

		this.c = c;

		this.d = d;

	}
	@Override

	public double area()

	{

		return (((a + b) / 2.0)) * h;

	}

	@Override

	public String toString()

	{

		return String.format("%s, %d)", super.toString(), h);

	}
}
