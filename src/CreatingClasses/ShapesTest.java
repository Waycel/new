package CreatingClasses;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes myShape= new Shapes();
        System.out.println(myShape.symbol);
        myShape.printPyramid();
        Shapes myShape2= new Shapes('@',8,12);
        myShape2.printPyramid();
        myShape2.printRectangle();
        Shapes myShape3= new Shapes('$', 10, 16);
        myShape3.printRectangle();
        myShape.printRectangle();
        myShape3.printRectangle('#');
    }
}
