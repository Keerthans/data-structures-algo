package arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] input = {4, 1, 3, 2, 4};
        duplicate(input);
    }

    private static void duplicate(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[Math.abs(arr[i])] > 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {
                System.out.println("The value " + Math.abs(arr[i])+" is a repetition");
            }
        }
    }
}
