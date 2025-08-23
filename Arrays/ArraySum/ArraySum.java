import java.util.*;
public class Sum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("Elements of the array are:");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.print("Sum of the elements is:");
      int s = 0;
      for (int i = 0; i < n; i++) {
         s += arr[i];
      }
      System.out.println(s);
   }
}
