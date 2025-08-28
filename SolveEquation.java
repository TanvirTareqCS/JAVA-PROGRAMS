import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the value of a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double det = a * e - b * d;
        if (det == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x = (c * e - b * f) / det;
            double y = (a * f - c * d) / det;
            System.out.printf("%.3f %.3f", x, y);
        }
    }
}