public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Krasava", 5);
        Ball b2 = new Ball("Brazuka", 4);
        Ball b3 = new Ball("Jabulani", 5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.babyOrAdultBall();
        b2.babyOrAdultBall();
        b3.babyOrAdultBall();
    }
}
