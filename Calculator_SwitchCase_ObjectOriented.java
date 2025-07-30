import java.util.Scanner;

class calculator{
    int num1;
    int num2;
    calculator(int a,int b){
        num1=a;
        num2=b;
    }
    void operation(char op){
        switch(op){
            case '+':
                int sum = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case '-':
                int sub = num1 - num2;
                System.out.println("Sub of " + num1 + " and " + num2 + " is " + sub);
                break;
            case '*':
                int mul = num1 * num2;
                System.out.println("Product of " + num1 + " and " + num2 + " is " + mul);
                break;
            case '/':
                float div = (float) num1 / num2;
                System.out.println("Quotient of " + num1 + " and " + num2 + " is " + div);
                break;
            case '%':
                int mod = num1 % num2;
                System.out.println("Mod of " + num1 + " and " + num2 + " is " + mod);
                break;
            default:
                System.out.println(op + " is not a Valid Operator!!");
        }
    }

}

public class Calculator_SwitchCase_ObjectOriented {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the First number --> ");
        int x=scanner.nextInt();
        System.out.print("Enter the Second number --> ");
        int y=scanner.nextInt();
        System.out.print("Enter the operator --> ");
        char ops=scanner.next().charAt(0);

        calculator ob1=new calculator(x,y);
        ob1.operation(ops);

    }
}
