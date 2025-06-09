import java.util.*;
public class prime {

    public static void main(String args[]){
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a");
        int a=in.nextInt();
         for (int i = 1; i<=a; i++)
         {
            if(a%i==0)
            {
                count+=1;
            }
         }
         if(count==2)
         System.out.println("prime");
         else{
            System.out.println("not prime");
         }
    }
    }
     