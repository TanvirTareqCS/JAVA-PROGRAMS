import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindowMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int sz = scanner.nextInt();
        int[] arr = new int[sz];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < sz; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the window size k: ");
        int k = scanner.nextInt();

        if (k > sz) {
            System.out.println("Window size cannot be larger than array size.");
            return;
        }

        int numWindows = sz - k + 1;
        double[] medians = new double[numWindows];

        for (int i = 0; i < numWindows; i++) {
            int[] window = new int[k];
            for (int j = 0; j < k; j++) {
                window[j] = arr[i + j];
            }
            Arrays.sort(window);

            if (k % 2 == 1) {
                medians[i] = window[k / 2];
            } else {
                medians[i] = (window[k / 2 - 1] + window[k / 2]) / 2.0;
            }


            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int j = 0; j < sz; j++) {
                if (j == i) {
                    sb.append("|");
                }
                sb.append(arr[j]);
                if (j == i + k - 1) {
                    sb.append("|");
                }
                if (j < sz - 1) {
                    sb.append(", ");
                }
            }
            sb.append("}");


            String medianStr;
            if (medians[i] == (int) medians[i]) {
                medianStr = Integer.toString((int) medians[i]);
            } else {
                medianStr = Double.toString(medians[i]);
            }

            System.out.println(sb.toString() + " -> Return median " + medianStr);
        }


        System.out.print("Result array {");
        for (int i = 0; i < medians.length; i++) {
            if (medians[i] == (int) medians[i]) {
                System.out.print((int) medians[i]);
            } else {
                System.out.print(medians[i]);
            }
            if (i < medians.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}