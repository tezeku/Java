public class Square extends Rectangle{
    private double side;
    public Square(){};
    public Square(double _side){
        side = _side;
    }
    public Square(double _side, String _color, boolean _filled){
        side = _side;
        color = _color;
        filled = _filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString()+"Square{" +
                "side=" + side +
                ", color='" + color +
                '}';
    }
}
