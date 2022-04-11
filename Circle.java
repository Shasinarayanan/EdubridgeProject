package shapes;

public class Circle extends TwoD {
	public Circle()
    {
    	
    }
    public Circle(ShapeColor sc,int a)
    {
    	super(sc,a);
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double circle;
		circle=Math.PI*a*a;//PI*R*R
		return circle;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
    
    
}
