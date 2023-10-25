public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Vladimir", "VovaKrutoj@mail.ru", 'm');
        Author a2 = new Author("Artemiy", "TyomaKrutoj@mail.ru", 'm');
        Author a3 = new Author("Marina", "MarinaKrutaya@mail.ru", 'f');

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        a1.setEmail("Vladimir@mail.ru");
        a2.setEmail("Artemiy@mail.ru");
        a3.setEmail("Marina@mail.ru");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
