public class Main {
    public static void main(String[] args) {


        Calculator calсulator = new Calculator();
//

        System.out.println(calсulator.plus(2, 5));
        System.out.println(calсulator.minus(2, 5));
        System.out.println(calсulator.multiply(2, 5));

        try {
            System.out.println(calсulator.divide(2,0));
        }catch (DivideOnNullExeption e) {
            System.out.println(e.getMessage());
        }
    }
   
}