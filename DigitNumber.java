import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A= ");
        int a = scanner.nextInt();
        System.out.print("B= ");
        int b = scanner.nextInt();
        int sum = a + b;

        int count = 0;

            int n = sum;
            while (n != 0) {
                n /= 10;
                count++;
            }


        System.out.println("Digit number of sum of said two integers: " + count);
    }
}