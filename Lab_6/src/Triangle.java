import com.sun.media.jfxmediaimpl.MediaDisposer;

public class Triangle implements Shape, MediaDisposer.Disposable{
    private float edge1,edge2,edge3;
    public Triangle(float edge1,float edge2,float edge3) {
        this.edge1=edge1;
        this.edge2=edge2;
        this.edge3=edge3;
    }
    @Override
    public float computePerimeter() {
        return edge1+edge2+edge3;
    }
    @Override
    public float computeArea() {
        float semiPerimeter=computePerimeter()/2;
        return (float)Math.sqrt(semiPerimeter*(semiPerimeter-edge1)*(semiPerimeter-edge2)*(semiPerimeter-edge3));
    }
    public float getEdge1() {
        return edge1;
    }
    public void setEdge1(float edge1) {
        this.edge1 = edge1;
    }
    public float getEdge2() {
        return edge2;
    }
    public void setEdge2(float edge2) {
        this.edge2 = edge2;
    }
    public float getEdge3() {
        return edge3;
    }
    public void setEdge3(float edge3) {
        this.edge3 = edge3;
    }


    @Override
    public void dispose() {
        System.out.println("Triangle destroyed!");
    }
}