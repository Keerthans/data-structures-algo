package arrays;

import java.util.Arrays;

public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        int[] result = reverseArray(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseArray(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex < endIndex) {
            swap(nums, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        return nums;
    }

    private static int[] swap(int[] nums, int startNum, int endNum) {
        int temp = nums[startNum];
        nums[startNum] = nums[endNum];
        nums[endNum] = temp;
        return nums;
    }
}
