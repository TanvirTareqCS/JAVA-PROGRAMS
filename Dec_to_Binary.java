import java.util.Scanner;
public class Dec_to_Binary {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int a=scanner.nextInt(),storea=a;
        int[] bin=new int[35];
        int i=0,zcount=0;
        while(a>0){
            bin[i++]=a%2;
            a=a/2;
        }
        System.out.print("Binary representation of "+storea+" is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j] + " ");
            if(bin[j]==0){
                zcount++;
            }
        }
        System.out.println("\nNumber of zero bits: "+zcount);

    }
}
