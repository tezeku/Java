public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("book_1", 500);
        Book b2 = new Book("book_2", 98);
        Book b3 = new Book("book_3", 267);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.bigOrSmallBook();
        b2.bigOrSmallBook();
        b3.bigOrSmallBook();
    }
}
