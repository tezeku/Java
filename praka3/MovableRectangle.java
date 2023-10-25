public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0, 0, 0, 0);
    MovablePoint bottomRight = new MovablePoint(0, 0, 0, 0);

    public MovableRectangle(int x1, int y1, int x1Speed, int y1Speed, int x2, int y2, int x2Speed, int y2Speed) {
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = x1Speed;
        topLeft.ySpeed = y1Speed;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = x2Speed;
        bottomRight.ySpeed = y2Speed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    public int getSpeed1() {
        return topLeft.xSpeed;
    }
    public int getSpeed2() {
        return bottomRight.xSpeed;
    }

    public boolean checkSpeed() {
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
            return true;
        else return false;
    }
}
