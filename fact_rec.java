import java.util.*;

public class fact_rec {
    public static int fact(int n) {
        if (n>0) {
            return n*(fact(n-1));
        }
        else if(n==0){
            return 1;
        }
        else{
            return 0;
        }
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = in.nextInt();
        int result = fact(num);
System.out.println("Factorial: " + result);
        
    }
}