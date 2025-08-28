import java.util.Scanner;

public class CheckParallelLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input P(x1,y1),separated by a space.");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Input Q(x2,y2),separated by a space.");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Input R(x3,y3),separated by a space.");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Input S(x4,y4),separated by a space.");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();


        double pqx = x2 - x1;
        double pqy = y2 - y1;
        double rsx = x4 - x3;
        double rsy = y4 - y3;


        double crossProduct = pqx * rsy - pqy * rsx;


        if (Math.abs(crossProduct) < 1e-5) {
            System.out.println("Two lines are parallel.");
        } else {
            System.out.println("Two lines are not parallel.");
        }
    }
}
