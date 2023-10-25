package lesson_2.src;

public class Ball1 {
    private double x = 0.0;
    private double y = 0.0;

    public Ball1(){}

    public Ball1(double _x, double _y){
        x = _x;
        y = _y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double _x){
        x = _x;
    }

    public void setY(double _y){
        y = _y;
    }

    public void setXY(double _x, double _y){
        x = _x;
        y = _y;
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString(){
        return "Ball @ ("+x+", "+y+").";
    }
}
