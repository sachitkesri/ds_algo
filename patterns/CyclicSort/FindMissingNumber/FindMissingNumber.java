
/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * Example 2:
 * <p>
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * Example 3:
 * <p>
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
public class FindMissingNumber {

    public static void main(String[] args) {

        int[] a = {3, 0, 1};

        // Solution 1: using cyclic sort.
        System.out.println(missingNumberUsingCyclicSort(a));

        //Solution 2: Using Sum of numbers
        System.out.println(missingNumberUsingSum(a));
    }

    private static int missingNumberUsingSum(int[] a) {
        int n = a.length;
        int totalSum = (n * (n + 1)) / 2;

        for (int i : a) {
            totalSum -= i;
        }

        return totalSum;
    }


    static int missingNumberUsingCyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }


        }
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]) {
                return index;
            }
        }

        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {


        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
