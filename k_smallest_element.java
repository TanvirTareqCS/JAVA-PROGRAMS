import java.util.Scanner;
import java.util.Arrays;

public class k_smallest_element {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int sz=scanner.nextInt();
        int[] arr=new int[sz];
        System.out.println("Enter the array: ");
        for(int i=0;i<sz;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("How many largest element you want to see: ");
        int k=scanner.nextInt();

        System.out.println(k+" largest elements of the said array are:");
        for(int i=(sz-k);i<sz;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
