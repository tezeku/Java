public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){};
    public Rectangle(double _width, double _length){
        width = _width;
        length = _length;
    }
    public Rectangle(double _width, double _length, String _color, boolean _filled){
        width = _width;
        length = _length;
        color = _color;
        filled = _filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimetr(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString()+"Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
