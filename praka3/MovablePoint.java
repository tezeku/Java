public class MovablePoint implements Movable {
    static int x;
    static int y;
    static int xSpeed;
    static int ySpeed;

    public MovablePoint(int _x, int _y, int _xSpeed, int _ySpeed){
        x = _x;
        y = _y;
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp(){
        y += 1;
    }
    public void moveDown(){
        y -= 1;
    }
    public void moveLeft(){
        x -= 1;
    }
    public void moveRight(){
        x += 1;
    }
}
