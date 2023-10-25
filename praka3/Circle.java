public class Circle extends Shape{
    private double radius;
    public Circle(){};
    public Circle(double _radius){
        radius = _radius;
    }
    public Circle(double _radius, String _color, boolean _filled){
        radius = _radius;
        color = _color;
        filled = _filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double _radius){
        radius = _radius;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimetr(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return super.toString()+" Circle{" +
                "radius=" + radius+
                '}';
    }
}
