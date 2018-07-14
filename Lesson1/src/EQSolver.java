import java.util.Arrays;

//Module2 Task1
public class EQSolver {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solveEQ(1, -8, 12)));
        System.out.println(Arrays.toString(solveEQ(5, 0, 30)));
        System.out.println(Arrays.toString(solveEQ(0, -8, 30)));

    }

    static double[] solveEQ(double a, double b, double c) {
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return new double[]{x1, x2};
    }
}
