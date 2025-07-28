import java.util.*;
public class stringpalindrome {

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter string:");
        String input=in.nextLine();

         String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
            //  for (int i = 0; i < input.length() / 2; i++) {
           // if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
        }

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
    