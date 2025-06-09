import java.util.*;
public class factorial {

    public static void main(String args[]){
        int fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a");
        int a=in.nextInt();
         for (int i = 1; i<=a; i++)
         {
         fact=fact*i;
    }
    System.out.println("factorial of no is:"+fact);
    }
}
