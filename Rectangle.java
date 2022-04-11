package shapes;

public class Rectangle extends TwoD{
	public Rectangle()
    {

	}
    public Rectangle(ShapeColor sc, int length, int width)

	{

	super(sc, length, width);

	}

	public Rectangle(Rectangle r)

	{

	this(r.sc, r.a, r.b);

	}

	@Override

	public double area()

	{

	return a * b;

	}

	public int getLength()

	{

	return getA();

	}

	public int getWidth()

	{

	return getB();

	}

	public void set(ShapeColor sc, int length, int width)

	{

	this.sc = sc;

	this.a = length;

	this.b = width;

	}

	@Override

	public String toString()

	{

	return super.toString();

	}
}
