public class Book{
    private String name;

    private int countPage;

    public Book(String _name, int _cntPage) {
        name = _name;
        countPage = _cntPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", count of page=" + countPage +
                '}';
    }

    public void setName(String _name){
        name = _name;
    }

    public void setCountPage(int _cntPage){
        countPage = _cntPage;
    }

    public String getName() {
        return name;
    }

    public int getCountPage() {
        return countPage;
    }

    public String getInfo(){
        return "name "+name+", count of page "+countPage;
    }

    public void bigOrSmallBook(){
        if (getCountPage() > 300)
            System.out.println("it's a big book");
        else
            System.out.println("it's a small book");
    }
}
