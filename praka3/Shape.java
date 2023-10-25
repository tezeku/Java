public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        System.out.println("Shape constructor");
    }
    public Shape(String _color, boolean _filled){
        color = _color;
        filled = _filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String _color){
        color = _color;
    }
    public void setFilled(boolean _filled){
        filled = _filled;
    }
    public boolean isFilled(){
        if (filled == true)
            return true;
        else
            return false;
    }
    abstract double getArea();
    public abstract double getPerimetr();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
