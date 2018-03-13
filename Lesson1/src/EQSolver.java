public class EQSolver {
    public static void main(String[] args) {
        double a = 2;
        double b = -1;
        double c = -1;

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println(x1 + "\n" + x2);
    }
}
