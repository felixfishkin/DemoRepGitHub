public class ResultOfSqUrav {
    double a;
    double b;
    double c;
    double discrim;

    void printDiscriminant(){
        discrim = b*b - 4*a*c;
        System.out.println(discrim);
    }

    ResultOfSqUrav (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
}
