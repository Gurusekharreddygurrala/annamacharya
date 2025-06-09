import java.util.Scanner;

public class DuplicateUsingTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = a[i]; // Copy array
        }

        System.out.println("Duplicate elements:");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
            if (count > 1) {
                // Check if already printed
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (a[k] == a[i]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
