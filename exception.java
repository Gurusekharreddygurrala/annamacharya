import java.util.*;
public class exception {

    public static void main(String args[]){
        int c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a");
        int a=in.nextInt();
        System.out.println("enter b");
        int b=in.nextInt();
        try{
            c=a/b;
            System.out.println("result:"+c);
            
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
     
}