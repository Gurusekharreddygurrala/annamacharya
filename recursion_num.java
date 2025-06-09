import java.util.*;

public class recursion_num {
    public static void recur(int n) {
        if (n > 0) {
            System.out.println(n);
            recur(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = in.nextInt();
        recur(num);
    }
}
