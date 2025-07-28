import java.util.*;
public class max_min{
    public static void main(String []args){
        int a[]=new int[10];
        int min;
        Scanner in =new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<5;i++){
            a[i]=in.nextInt();
        }
        min=a[0];
         for(int i=0;i<5;i++){
            if(a[i]<min){
                min=a[i];
            }
    }
    System.out.println(min);
}
}