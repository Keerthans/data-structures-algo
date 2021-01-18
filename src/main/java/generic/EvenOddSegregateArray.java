package generic;

/*
Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers.
Example:

Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3}
 */

/*
Solution 1:
1) Initialize two index variables left and right:
            left = 0,  right = size -1
2) Keep incrementing left index until we see an odd number.
3) Keep decrementing right index until we see an even number.
4) If lef < right then swap arr[left] and arr[right]
 */

/*
Solution 2:
1) Initialize a varible with -1 and temp.
2) Start iterating from left and check for even
3) If its even increase the variable and swap the element
  if (arr[i] % 2 == 0) {

                // increment j by one
                j++;

                // swap the element
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
 */

public class EvenOddSegregateArray {

    public static int[] segreateOddEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else {
                arr[right] = arr[right] + arr[left];
                arr[left] = arr[right] - arr[left];
                arr[right] = arr[right] - arr[left];
                right--;
            }
        }

        return arr;
    }

    static void rearrangeEvenAndOdd(int arr[], int n) {
        int j = -1,temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {12, 10, 23, 25, 3, 13, 36, 28};
        int[] result = segreateOddEven(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}
