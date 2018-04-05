
//Module2 Task1
public class EQSolver {

    public static void main(String[] args) {
//        double a = 0;t

        // case 1
        double a = 1;
        double b = -8;
        double c = 12;

        //case 2
//        double a = 5;
//        double b = 0;
//        double c = 30;


        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println(x1 + "\n" + x2);
    }
}
