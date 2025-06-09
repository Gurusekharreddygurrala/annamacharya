import java.util.*;
public class reverse {

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int temp,rev=0;
        System.out.println("enter n");
        int n=in.nextInt();
        while(n>0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println("reverse of number:"+rev);
    }
}