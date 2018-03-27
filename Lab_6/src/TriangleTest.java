import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle t1, t2, t3;

    @Test
    public void compute_perimeter_when_using_t1_expect_12() {
        assertEquals(t1.computePerimeter(), 12);
    }

    @Test
    public void computeArea() {
        assertEquals(t3.computeArea(), 1.837117307);
    }


    @Test
    public void setEdge3() {
        try {
            t1.setEdge3(-5);
            fail("Set edge 3 failde no exception");
        }catch (Exception e){}

    }
    @Before
    public void init(){
        t1 = new Triangle(3,4,5);
        t2 = new Triangle(1,2,3);
        t3 = new Triangle(1,1,1);
    }

    @After void end(){
        t1.dispose();
        t2.dispose();
        t3.dispose();
    }

}