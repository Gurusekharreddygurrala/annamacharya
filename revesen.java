import java.util.*;
public class revesen{
    public static void main(String []args){
        int n=123,temp,rev=0;
        while(n!=0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println(rev);
        
        

    }
}