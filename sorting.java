import java.util.*;
public class sorting{

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        
         System.out.println("enter n");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter numbers to array:");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
               int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}