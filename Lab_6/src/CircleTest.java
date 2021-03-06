import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

class CircleTest {

    static Circle circle1, circle2, circle3;
    @org.junit.Test
    public void compute_perimeter_when_input_is_10_then_expect_314() {
        assertEquals((int)circle1.computePerimeter(),314);
    }

    @org.junit.Test
    public void create_square_when_input_is_negative_then_expect_error() {
        try {
            Circle circle = new Circle(-3);
            fail();
        }
        catch (Exception e) {

        }
    }

    @org.junit.Test
    public void compute_perimeter_when_input_is_4_then_expect_25() {
        assertEquals((int)circle2.computePerimeter(), 25);
    }

    @org.junit.Test
    public void compute_diameter_when_input_is_4_then_expect_8() {
        assertEquals((int)circle2.computeDiameter(), 8);
    }


    @org.junit.Test
    public void get_radius_when_input_is_3_then_expect_3() {
        assertEquals(circle3.getRadius(),4);
    }


    @org.junit.BeforeClass
    public static void init() throws TestValid{
        circle1 = new Circle(10);
        circle2 = new Circle(4);
        circle3 = new Circle(4);
    }

    @org.junit.AfterClass
    public static void finalizer(){
        circle1.dispose();
        circle2.dispose();
        circle3.dispose();
    }

}