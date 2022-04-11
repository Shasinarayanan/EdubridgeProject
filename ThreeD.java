package shapes;

public  abstract class ThreeD implements Resizable,Shape{

	protected ShapeColor sc;
	protected double a;
	public ThreeD() {
		super();
	}
	public ThreeD(ShapeColor sc, double a) {
		super();
		this.sc = sc;
		this.a = a;
	}
	public ShapeColor getSc() {
		return sc;
	}
	public double getA() {
		return a;
	}
	public void setSc(ShapeColor sc) {
		this.sc = sc;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double volume()
	{
		return a*a*a;
	}
	public void reSize(double percentage)

	{

	double resize = a * (percentage / 100);

	a = a - resize;

	}
	public String toString()

	{

	return String.format("%s (3D (%s, %.3f))", getClass().getName(), sc, a);

	}

}
