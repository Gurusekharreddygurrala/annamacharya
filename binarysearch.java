import java.util.*;
public class binarysearch{
  
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // element found
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // element not found
    }


    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
         System.out.println("enter n");
        int n=in.nextInt();
         System.out.println("enter key");
        int target=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter numbers to array:");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int result=binarySearch(a, target);
        if(result!=-1){
            System.out.println("element found at index"+result);
        }
        else{
            System.out.println("not found!");
        }
    }
}