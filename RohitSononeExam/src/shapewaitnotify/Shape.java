package shapewaitnotify;

public abstract class Shape {
	
	private double radius;
	
    public abstract double calArea();
	
	public abstract double calPerimeter();
	

	
	public Shape()
	{
		System.out.println("Constructor");
	}

	public Shape(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
