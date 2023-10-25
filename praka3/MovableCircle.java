public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    public MovableCircle(int _x, int _y, int _xSpeed, int _ySpeed, int _radius){
        center.x = _x;
        center.y = _y;
        center.xSpeed = _xSpeed;
        center.ySpeed = _ySpeed;
        radius = _radius;
    }
    public void moveUp() {
        center.y += 1;
    }
    public void moveDown() {
        center.y -= 1;
    }
    public void moveLeft() {
        center.x -= 1;
    }
    public void moveRight() {
        center.x += 1;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
