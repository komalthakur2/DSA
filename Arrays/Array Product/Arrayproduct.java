import java.util.*;

public class Product {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n = sc.nextInt();
      int[] arr = new int[n];

      System.out.println("Enter the elements of the array:");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.print("Product of the elements is:");
      int product = 1;
      for (int i = 0; i < arr.length; i++) {
         product *= arr[i];
      }
      System.out.println(product);

   }

}
