
public class Square implements Shape{
	private float edge;
	
	public Square(float edge) throws TestValid {
		if(edge<=0)
			throw new TestValid("Negative square edge");
		
		this.edge=edge;
	}

	@Override
	public float computePerimeter() {
		return 4*edge;
	}

	@Override
	public float computeArea() {
		return edge*edge;
	}
	
	public float computeDiagonal() {
		return edge*(float)(Math.sqrt(2));
	}

	public float getEdge() {
		return edge;
	}

	public void setEdge(float edge) throws TestValid {
		if(edge<=0)
			throw new TestValid("Negative square edge");
		
		this.edge = edge;
	}
	
	

}
