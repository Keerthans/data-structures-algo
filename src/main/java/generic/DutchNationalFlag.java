package generic;

/*
Dutch national flag sorting problem

(1) Create a low pointer at the beginning of the array and a high pointer at the end of the array.
(2) Create a mid pointer that starts at the beginning of the array and iterates through each element.
(3) If the element at arr[mid] is a 2, then swap arr[mid] and arr[high] and decrease the high pointer by 1.
(4) If the element at arr[mid] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
(5) If the element at arr[mid] is a 1, don't swap anything and just increase the mid pointer by 1.
 */

public class DutchNationalFlag {

    static int[] DNFS(int arr[], int arr_size)
    {
        int low = 0;
        int high = arr_size - 1;
        int mid = 0, temp=0; // temp variable is used for swapping
        while (mid <= high)
        {
            switch (arr[mid])
            {
                case 0: // mid pointer points at 0
                {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: // mid pointer points at 1
                    mid++;
                    break;
                case 2: // mid pointer points at 2
                {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] dnfs = DNFS(arr, arr.length);

        for(int a : dnfs){
            System.out.print(a+" ");
        }
    }
}
