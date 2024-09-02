import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Чему равен a? (Введи значение и нажми Enter.)");
        double a = scanner.nextDouble();

        System.out.println("Чему равен b? (Введи значение и нажми Enter.)");
        double b = scanner.nextDouble();

        System.out.println("Чему равен c? (Введи значение и нажми Enter.)");
        double c = scanner.nextDouble();
        scanner.close();



        QuadraticCalculator calculator = new QuadraticCalculator();

        String result = calculator.doJob(a, b, c);
        System.out.println(result);
    }
}