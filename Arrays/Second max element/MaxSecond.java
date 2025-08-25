import java.util.*;
public class Secondmaxarr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > Smax) && (arr[i] != max)) {
                Smax = arr[i];
            }
        }
        if (Smax == Integer.MIN_VALUE) {
            System.out.println("No second largest element all elements are same");
        } else {
            System.out.print("Second largest element is: " + Smax);
        }
    }
}
