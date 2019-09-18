package CreatingClasses;

public class PaintTest {
    public static void main(String[] args) {
        Paint myPaint= new Paint("Zero Gravity", 0.0, 1450);
        System.out.println(myPaint.toString());
        myPaint.calculatePrice(1450);
        System.out.println(myPaint.toString());
    }
}
