public class TwoSumFinder {

    public static int[] findTwoSum(int[] arr, int targetNumber) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // When two numbers should not be equal
                if (arr[i] != arr[j]) {
                    if (arr[i] + arr[j] == targetNumber) {
                        return new int[]{arr[i], arr[j]};
                    }
                }
            }
        }
        // If no pair found, return an empty array or null
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 2};
        int target = 9;

        int[] result = findTwoSum(arr, target);
        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found.");
        }
    }
}