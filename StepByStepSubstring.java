import java.util.HashSet;

public class StepByStepSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;

        System.out.println("Input: " + s);
        System.out.println("----------------------");

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            System.out.println("Checking: '" + current + "'");

            while (set.contains(current)) {
                System.out.println("  '" + current + "' already in set, removing '" + s.charAt(left) + "'");
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            int windowSize = right - left + 1;
            max = Math.max(max, windowSize);

            System.out.println("  Current set: " + set);
            System.out.println("  Current window: " + s.substring(left, right + 1));
            System.out.println("  Max so far: " + max);
            System.out.println("----------------------");
        }

        System.out.println("Longest substring length without repeat: " + max);
    }
}
