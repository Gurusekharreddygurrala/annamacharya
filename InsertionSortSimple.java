public class InsertionSortSimple {
    public static void main(String[] args) {
        int[] numbers = {8, 4, 1, 5, 2};

        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            // Shift elements to the right to make space
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // Insert the current number at the correct position
            numbers[j + 1] = current;
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
