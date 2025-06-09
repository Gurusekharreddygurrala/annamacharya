import java.util.*;
public class largestno{

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
         System.out.println("enter n");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter numbers to array:");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();

        }
        int max=a[0];
         for(int i=0;i<n;i++){
            if(a[i] > max){
            max=a[i];
         }
        }
         System.out.println(max);
    
}
}