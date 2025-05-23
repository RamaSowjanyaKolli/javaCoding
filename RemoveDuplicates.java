public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] sortedArray) {
        int[] temp = new int[sortedArray.length];
        int index = 0;

        for (int i = 0; i < sortedArray.length; i++) {
            // Check if sortedArray[i] already exists in temp array
            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if (temp[j] == sortedArray[i]) {
                    exists = true;
                    break;
                }
            }

            // If not exists, add to temp array
            if (!exists) {
                temp[index++] = sortedArray[i];
            }
        }

        // Copy unique elements to result array of proper size
        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = temp[k];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 3, 4, 5, 5};
        int[] unique = removeDuplicates(input);

        System.out.print("Unique elements: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}