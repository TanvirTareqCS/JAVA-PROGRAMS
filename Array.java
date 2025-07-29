import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number--> ");
        int sz=scanner.nextInt();

        int[] array=new int[sz];
        int sum=0;

        for(int i=0;i<sz;i++){
            System.out.println("Enter the "+(i+1)+"th element --> ");
            array[i]=scanner.nextInt();
            sum=sum+array[i];
        }
        int min=array[0];

        for(int i=1;i<sz;i++){
            if(min>array[i]){
                min=array[i];
            }
        }

        System.out.print("The array is -->");
        for(int i=0;i<sz;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nThe sum of the array is --> "+sum);
        System.out.println("the minimum number is --> "+min);

    }
}
