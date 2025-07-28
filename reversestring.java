import java.util.*;
public class reversestring{
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";
        StringBuilder sb=new StringBuilder(str);
        sb.append("hi");
        System.out.println(sb);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Appending characters in reverse
        }
        char[] arr1 = reversed.toCharArray();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
        Arrays.sort(arr1);
        System.out.println(arr1);
    }
}
