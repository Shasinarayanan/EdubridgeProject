package shapes;

public class Cube extends ThreeD {
	public Cube()

	{

	}

	public Cube(ShapeColor sc, double a)

	{

	super(sc, a);

	}

	public Cube(Sphere c)

	{

	this( c.sc, c.a);

	}

	@Override

	public double area()

	{

	return 6 * a * a;

	}

	@Override

	public double volume()

	{

	return super.volume();

	}

	public double getA()

	{

	return a;

	}

	public void set(ShapeColor sc, double a)

	{

	this.sc = sc;

	this.a = a;

	}

	@Override

	public String toString()

	{

	return super.toString();

	}
}
