public class hashsubstring{
    public static void main(String[] args) {
        String s = "abcabcbb";
        java.util.HashSet<Character> set = new java.util.HashSet<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        System.out.print("max: " + max );
    }
}
