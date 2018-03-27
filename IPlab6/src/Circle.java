
public class Circle implements Shape{
	private float radius;
	public Circle(float radius) throws TestValid {
		if(radius<=0)
			throw new TestValid("Negative circle radius");
		this.radius=radius;
	}
	public float computeDiameter() {
		return 2*radius;
	}
	
	@Override
	public float computePerimeter() {
		
		return (float)(2*Math.PI*radius);
	}
	@Override
	public float computeArea() {

		return (float)(Math.PI*radius*radius);
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) throws TestValid {
		if(radius<=0)
			throw new TestValid("Negative circle radius");
		this.radius = radius;
	}

}
