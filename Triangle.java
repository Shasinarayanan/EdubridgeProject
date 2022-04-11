package shapes;

public class Triangle extends TwoD {

	public Triangle() {

	}

	public Triangle(ShapeColor sc, int a, int b, int c) {
		super(sc, a, b, c);

	}
   public int getA(){

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

	public void set(ShapeColor sc, int a, int b, int c)

	{

		this.sc = sc;

		this.a = a;

		this.b = b;

		this.c = c;

	}
	@Override
	public double area() {
		double ta = (a + b + c) / 2.0;
		return Math.sqrt(ta * (ta - a) * (ta - b) * (ta - c));

	}

	@Override

	public String toString()

	{

		return super.toString();

	}
	

}
