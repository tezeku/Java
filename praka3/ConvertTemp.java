import java.util.Scanner;

public class ConvertTemp implements Convertable {
    public double convert(double a, int ch) {
        if (ch == 1)
            return a+273.15;
        else
            return (a*1.8)+32;

    }
    public static void main(String[] args) {
        ConvertTemp conv = new ConvertTemp();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах цельсия: ");
        double temp = scanner.nextDouble();
        System.out.print("Перевести в Кельвины или градусы Фаренгейта?: ");
        int ch = scanner.nextInt();
        System.out.println("Переведенная температура: "+conv.convert(temp, ch));
    }
}
