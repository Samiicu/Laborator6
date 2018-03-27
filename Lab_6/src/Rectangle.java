import com.sun.media.jfxmediaimpl.MediaDisposer;

public class Rectangle implements Shape,MediaDisposer.Disposable {
    private float edge1,edge2;
    public Rectangle(float edge1,float edge2) throws TestValid {
        if(edge1<=0 || edge2<=0)
            throw new TestValid("Negative rectangle edge");
        this.edge1=edge1;
        this.edge2=edge2;
    }
    @Override
    public float computePerimeter() {
        return 2*edge1+2*edge2;
    }
    @Override
    public float computeArea() {
        return edge1*edge2;
    }

    public float computeDiagonal() {
        return (float)Math.sqrt(edge1*edge1+edge2*edge2);
    }
    public float getEdge1() {
        return edge1;
    }
    public void setEdge1(float edge1) throws TestValid {
        if(edge1<=0)
            throw new TestValid("Negative rectangle edge");
        this.edge1 = edge1;
    }
    public float getEdge2() {
        return edge2;
    }
    public void setEdge2(float edge2) throws TestValid {
        if(edge2<=0)
            throw new TestValid("Negative rectangle edge");
        this.edge2 = edge2;
    }


    @Override
    public void dispose() {
        System.out.println("Rectangle disposed!");
    }
}