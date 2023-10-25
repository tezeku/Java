public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Misha", 4);
        Dog d2 = new Dog("Makar", 1);
        Dog d3 = new Dog("Sharik", 9);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
