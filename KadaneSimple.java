public class KadaneSimple {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];       // Store the max sum so far
        int currentSum = arr[0];   // Store the current running sum

        for (int i = 1; i < arr.length; i++) {
            // Either start fresh from current number or add to current sum
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update max if current sum is higher
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
