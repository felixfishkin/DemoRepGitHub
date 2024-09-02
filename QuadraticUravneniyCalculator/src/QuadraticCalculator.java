public class QuadraticCalculator {

    String doJob(double a, double b, double c){
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
        return null;
    }
        }


