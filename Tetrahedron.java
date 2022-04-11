package shapes;

public class Tetrahedron extends ThreeD {
	public Tetrahedron()

	{

	}
	public double getA()

	{

	return getA();

	}

	public void set(ShapeColor sc, double a)

	{

	this.sc = sc;

	this.a = a;

	}

	public Tetrahedron(ShapeColor sc, double a)

	{

	super(sc, a);

	}

	public Tetrahedron(Tetrahedron t)

	{

	this(t.sc, t.a);

	}

	@Override

	public double area()

	{
        
		return Math.sqrt(3)*(a*a);

	}

	@Override

	public double volume()

	{

	return super.volume()/ (6 * Math.sqrt(2) );

	}

	
	@Override

	public String toString()

	{

	return super.toString();

	}

}
