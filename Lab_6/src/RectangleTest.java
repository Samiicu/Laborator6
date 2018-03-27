import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    static Rectangle r1,r2,r3;
    @Test
    public void compute_perimeter_for_rectangle_r1_expect_40() {
        assertEquals(r1.computePerimeter(), 40);
    }

    @Test
    public void compute_area_for_rectangle_r2_expect_20() {
        assertEquals(r2.computeArea(), 20);
    }

    @BeforeClass
    public void bef(){
        try {
            r1 = new Rectangle(5, 15);
            r2 = new Rectangle(2, 10);
            r3 = new Rectangle(3, 15);
        }catch (TestValid v){
            System.out.println("Err");
        }
    }

    @AfterClass
    public void after(){
        r1.dispose();
        r2.dispose();
        r3.dispose();
    }
}