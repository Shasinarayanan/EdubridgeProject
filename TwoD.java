package shapes;

public abstract class TwoD implements Recolorable,Shape {

	protected ShapeColor sc;
	protected int a;
	protected int b;
	protected int c;
	protected int d;
	public TwoD() {
		super();
	}
	public TwoD(ShapeColor sc, int a) {
		super();
		this.sc = sc;
		this.a = a;
	}
	public TwoD(ShapeColor sc, int a, int b) {
		super();
		this.sc = sc;
		this.a = a;
		this.b = b;
	}
	public TwoD(ShapeColor sc, int a, int b, int c) {
		super();
		this.sc = sc;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public TwoD(ShapeColor sc, int a, int b, int c, int d) {
		super();
		this.sc = sc;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public ShapeColor getSc() {
		return sc;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void setD(int d) {
		this.d = d;
	}
	public void setSc(ShapeColor sc) {
		this.sc = sc;
	}
	public void reColor(ShapeColor sc)
	{
		this.sc=sc;
		
	}
	public String toString()

	{

	if (b == 0 && c == 0 && d ==0)

	{

	return String.format("%s (2D, %s, %d)", getClass().getName(), sc, getA());

	}

	else if ( c == 0 && d ==0)

	{

	return String.format("%s (2D, %s, %d, %d)", getClass().getName(), sc, getA(), getB());

	}

	else if( d == 0)

	{

	return String.format("%s (2D, %s, %d, %d, %d)",getClass().getName(), sc, getA(), getB(), getC());

	}

	else {

	return String.format("%s (2D, %s , %d, %d, %d, %d)", getClass().getName(), sc, getA(), getB(), getC(), getD());

	}

	}
	
}
