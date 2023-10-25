package lesson_2.src;

public class TestBall {
    public static void main(String[] args){
        Ball1 b1 = new Ball1(10, 10);
        System.out.println(b1);
        b1.move(3, 10);
        System.out.println(b1);
    }
}
