package generic;

/*
Same as EvenOddSegregateArray
 */
public class Segregate0sand1s {

    public static int[] seggregateOsAnd1s(int[] arr){
        int left =0;
        int right = arr.length-1;
        while (left<right){
            if (arr[left] == 1){
                arr[right] = arr[right] + arr[left];
                arr[left] = arr[right] - arr[left];
                arr[right] = arr[right] - arr[left];
                right--;
            } else {
                left++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 0, 1, 0, 0};
        int[] array = seggregateOsAnd1s(arr);


        for(int a : array){
            System.out.print(a+" ");
        }

    }
}
