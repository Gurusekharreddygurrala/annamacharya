import java.util.*;
public class linearsearch{

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
         System.out.println("enter n");
        int n=in.nextInt();
         System.out.println("enter key");
        int key=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter numbers to array:");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
         for(int i=0;i<n;i++){
            if(a[i]==key)
            {
                  System.out.println("key element is at"+i);
                  break;
            }
                
               
            
        }
           

    }
}