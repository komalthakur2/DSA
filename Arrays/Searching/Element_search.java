import java.util.*;
public class Search_in_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int element = sc.nextInt();
        
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
            
            index = i;
            break;
        }
    }
    if(index != -1){
        System.out.println("Element is present at index "+index);
    }
        else{
            System.out.println("Element is not present");
        }
    }
}
