public class Ball{
    private String name;
    private int siz;

    public Ball(String _name, int _siz) {
        name = _name;
        siz = _siz;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", size=" + siz +
                '}';
    }

    public void setName(String _name){
        name = _name;
    }

    public void setSize(int _siz){
        siz = _siz;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return siz;
    }

    public String getInfo(){
        return "name "+name+", size "+siz;
    }

    public void babyOrAdultBall(){
        if (getSize() >= 5)
            System.out.println("adult ball");
        else
            System.out.println("baby ball");
    }
}
