import java.util.Scanner;
public class MoveZeroToEnd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int sz=scanner.nextInt();
        int[] arr=new int[sz];
        System.out.print("Enter the element: ");
        for (int i=0;i<sz;i++){
            arr[i]=scanner.nextInt();
        }
        int index=0;
        for (int i=0;i<sz;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println("Final array :");
        for (int i=0;i<sz;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
