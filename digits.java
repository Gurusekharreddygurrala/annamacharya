import java.util.*;
public class digits{

    public static void main(String args[]){
        int count=0,temp;
        Scanner in=new Scanner(System.in);
         System.out.println("enter n");
        int n=in.nextInt();
        while(n>0){
            temp=n%10;
            count+=1;
            System.out.println("digits in no:"+temp);
            n=n/10;

        }
        System.out.println("no of digits"+count);
    }

        }