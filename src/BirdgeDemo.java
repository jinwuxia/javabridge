/**
 * client
 */
public class BirdgeDemo {
    public static void main(final String[] args) {
        Shape[] shapes = new Shape[] {
                new CircleShape(1, 2, 3, new DrawingAPI1()),
                new CircleShape(5, 7, 11, new DrawingAPI2()),
                new CircleShape(6, 9, 12, new DrawingAPI3())

        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
