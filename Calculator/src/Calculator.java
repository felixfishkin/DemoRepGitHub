public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;

    }

    int divide(int a, int b) throws DivideOnNullExeption {
        if (b==0){
            throw new DivideOnNullExeption("НЕЛЬЗЯ НА 0 ДЕЛИТЬ ЁПТАААА!!!1");
        }
        return a / b;


    }
}