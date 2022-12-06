package shapewaitnotify;

public class Circle extends Shape {
	
	public static final double PI=3.14;
	
	public Circle()
	{
		super();
	}
	public Circle(double radius)
	{
		super(radius);
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return PI * (this.getRadius()*this.getRadius());
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2 * PI * this.getRadius();
	}
	
}
