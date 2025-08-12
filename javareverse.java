import java.util.Scanner;
class reverse {
    int a;

    reverse() {
        a = 15;
    }

    void getinput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number --> ");
        a=scanner.nextInt();
    }

    void doReverse() {
        int revNum = 0;
        int newnum=a;
        while (a != 0) {

            int digit = a % 10;
            revNum = revNum * 10 + digit;
            a /= 10;

        }
        System.out.println(newnum+" reversed  is --> " + revNum);
    }
}
class javareverse {
    public static void main(String[] args){

        reverse ob1=new reverse();

        reverse ob2=new reverse();

        ob2.getinput();

        ob1.doReverse();
        ob2.doReverse();
    }

    }



