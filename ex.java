import java.util.*;
class main{
    public static void main(String[] args) {
        int n=3;
        int[] a=new int[n];
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter ele:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<a.length;i++)
        if(a[i]!=2){
            System.out.println("a="+a[i]);
        }
            else
            {
                count++;
            }
            for(int i=1;i<=count;i++)
            {
                System.out.println("-");
            }

    }
}
