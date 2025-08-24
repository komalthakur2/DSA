// If Array index is even add by 10 if index is odd multiply by 2
import java.util.*;
public class Array {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of the array:");
    for(int i=0;i<arr.length;i++){
       arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
    if(i % 2==0){
        arr[i]+=10;
    }
    else{
        arr[i]*=2;
    }
    }
    System.out.print("Updated array: ");
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] +" ");
    }
    
}
}
