import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Чему равен a? (Введи значение и нажми Enter.)");
        double a = console.nextDouble();

        System.out.println("Чему равен b? (Введи значение и нажми Enter.)");
        double b = console.nextDouble();

        System.out.println("Чему равен c? (Введи значение и нажми Enter.)");
        double c = console.nextDouble();

        double discrim = b * b - 4 * a * c;
        System.out.println("Дискриминант: " + discrim);

        if (discrim > 0) {
            double x1 = -(b + Math.sqrt(discrim)) / (2 * a);
            double x2 = -(b - Math.sqrt(discrim)) / (2 * a);
            System.out.println("Корни уравнения: " + x1 + ", " + x2);
        } else if (discrim < 0) {
            System.out.println("Уравнение не имеет корней=(");
        } else {
            double x = (-b) / 2 * a;
            System.out.println("У данного уравнения 1 корень: " + x);
        }
    }
}