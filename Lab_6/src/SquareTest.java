import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class SquareTest {

    static Square square1, square2, square3;
    @org.junit.Test
    public void compute_perimeter_when_input_is_5_then_expect_20() {
        assertEquals(square1.computePerimeter(),20);
    }

    @org.junit.Test
    public void create_square_when_input_is_negative_then_expect_error() {
        try {
            Square sq = new Square(-3);
            fail();
        }
        catch (Exception e) {

        }
    }

    @org.junit.Test
    public void compute_area_when_input_is_5_then_expect_25() {
        assertEquals(square1.computeArea(), 25);
    }

    @org.junit.Test
    public void compute_diagonal_when_input_is_4_then_expect_result() {
        //result  = 5,656854249
        assertEquals(square3.computeDiagonal(),5.656854249);
    }

    @org.junit.Test
    public void get_edge_when_input_is_4_then_expect_4() {
        assertEquals(square3.getEdge(),4);
    }

    @org.junit.Test
    public void verifY_edge_when_input_is_4_then_expect_4() {
        assertEquals(square3.getEdge(), 4);
    }

    @org.junit.BeforeClass
    public static void init() throws TestValid {
        square1 = new Square(5);
        square2 = new Square(1);
        square3 = new Square(4);
    }

    @org.junit.AfterClass
    public static void finalizer(){
        square1.dispose();
        square2.dispose();
        square3.dispose();
    }
}