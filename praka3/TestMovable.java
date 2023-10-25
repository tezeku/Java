public class TestMovable {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10, 30, 2, 2, 5);
        System.out.println(circle);
        MovablePoint center = new MovablePoint(50, 10, 5, 5);
        System.out.println(circle);
        MovableRectangle rectangle = new MovableRectangle(10, 20, 2, 2, -10, 0, 2, 2);
        if (rectangle.checkSpeed()) {
            rectangle.moveUp();
            rectangle.moveLeft();
            System.out.println(rectangle);
        }
        else
            System.out.println("Введены некорректные данные");
    }
}
