 /**
 * Leetcode75. Sort Colors — Dutch National Flag Problem
 *
 * Given an integer array nums containing values 0, 1, and 2, where:
 *   0 → Red
 *   1 → White
 *   2 → Blue
 *
 * Sort the array in-place so that all objects of the same color are adjacent,
 * arranged in the order: Red → White → Blue.
 *
 * The sorting must be done without using any library sort function.
 *
 * Example 1:
 * Input:  nums = [2, 0, 2, 1, 1, 0]
 * Output: [0, 0, 1, 1, 2, 2]
 *
 * Example 2:
 * Input:  nums = [2, 0, 1]
 * Output: [0, 1, 2]
 *
 * Constraints:
 * n == nums.length
 * 1 ≤ n ≤ 300 [ Input size of array range from 1 to 300]
 * nums[i] ∈ {0, 1, 2}
 *
 * Goal:
 * Modify nums in-place to achieve the desired sorted order.
 */

 package Arrays;
import java.util.Scanner;
public class SortColors {

    public static void sortColors(int[] arr)
    {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;


        while (mid<=high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr,mid, high);
                high--;
            }
        }
    }


    private static void swap(int[] arr,int first , int last)
    {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }


    public  static  void main(String args[]){
            Scanner sc = new Scanner(System.in);


            // Input array size
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = new int[6];

            // Input array elements
            System.out.println("Enter array elements (only 0, 1, 2):");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Print original array
            System.out.print("Original Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            // Sort
            sortColors(arr);

            // Print sorted array
            System.out.print("Sorted Array: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();

            sc.close();
        }
    }


