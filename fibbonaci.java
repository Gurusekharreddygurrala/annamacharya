import java.util.*;
public class fibbonaci {

    public static void main(String args[]){
        int a=0;
        int b=1;
        int c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter n");
        int n=in.nextInt();
         for (int i = 1; i<=n; i++)
         {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
         }
        }
         }