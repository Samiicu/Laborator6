import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws TestValid {
        ArrayList<Shape> shapes=new ArrayList<Shape>();

        /*shapes.add(new Square(4));*/
        shapes.add(new Triangle(3,5,7));
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(4,5));

        System.out.println(shapes.get(0).computeArea());
        System.out.println(shapes.get(1).computeArea());
        System.out.println(shapes.get(2).computeArea());
        /*System.out.println(shapes.get(3).computeArea());*/
    }

}