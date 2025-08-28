import java.util.Scanner;

public class Calculator_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first Number --> ");
        int a = scanner.nextInt();
        System.out.print("Enter the Second Number --> ");
        int b = scanner.nextInt();

        System.out.print("What should be the Operator? :");

        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                int sum = a + b;
                System.out.println("Sum of " + a + " and " + b + " is " + sum);
                break;
            case '-':
                int sub = a - b;
                System.out.println("Sub of " + a + " and " + b + " is " + sub);
                break;
            case '*':
                int mul = a * b;
                System.out.println("Product of " + a + " and " + b + " is " + mul);
                break;
            case '/':
                float div = (float) a / b;
                System.out.println("Quotient of " + a + " and " + b + " is " + div);
                break;
            case '%':
                int mod = a % b;
                System.out.println("Mod of " + a + " and " + b + " is " + mod);
                break;
            default:
                System.out.println(op + " is not a Valid Operator!!");


        }


    }
}