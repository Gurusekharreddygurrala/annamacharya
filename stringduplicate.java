public class stringduplicate{
    public static void main(String[] args) {
        String str = "hellollloo";

        System.out.println("Duplicate characters:");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                // Check if already printed
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (str.charAt(k) == str.charAt(i)) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(str.charAt(i));
                }
            }
        }
    }
}
