import java.util.*;
public class exam{
    public static void main(String []args){
        int a=1234;
        int n1=a%10;
        int b=2345;
        b=b/10;
        int n2=b%10;
        System.out.println(n1);
         System.out.println(n2);
         int c=3956;
         int max=1;
         while(c>0){
            int temp=c%10;
            if(temp>max){
                max=temp;
            }
            c=c/10;
         }
         System.out.println(max);


    }
    
}