/**
 * LeetCode 88 — Merge Sorted Array
 *
 * You are given two integer arrays nums1 and nums2, both sorted in
 * non-decreasing order, and two integers m and n representing the
 * number of valid elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single sorted array in non-decreasing order.
 * The final sorted array must be stored inside nums1.
 *
 * nums1 has a total length of m + n.
 * The first m elements contain the values to be merged.
 * The last n elements are placeholders (0) and should be ignored.
 * nums2 has a length of n and contains exactly n elements.
 *
 * Example 1:
 * Input:  nums1 = [1,2,3,0,0,0], m = 3
 *         nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 *
 * Example 2:
 * Input:  nums1 = [1], m = 1
 *         nums2 = [], n = 0
 * Output: [1]
 *
 * Example 3:
 * Input:  nums1 = [0], m = 0
 *         nums2 = [1], n = 1
 * Output: [1]
 *
 * Constraints:
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -10^9 <= nums1[i], nums2[j] <= 10^9
 *
 * Follow-up:
 * Try to design an algorithm that runs in O(m + n) time.
 *
 * @param nums1 the first array, which will store the merged result
 * @param m the number of valid elements currently in nums1
 * @param nums2 the second array to be merged into nums1
 * @param n the number of valid elements in nums2
 */

package Arrays;

public class MergeSortedArrays {

    public static void mergeSortedArrays(int[] nums1 , int m , int[] nums2 , int n)
    {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;

        while (i >= 0 && j >= 0)
        {
            if (nums1[i] < nums2[j])
            {
                nums1[index--] = nums2[j--];
            }
            else
            {
                nums1[index--] = nums1[i--];
            }
        }

        while (j >= 0)
        {
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args)
    {
        // nums1 has extra space for nums2
        int[] nums1 = {1, 3, 5, 7, 0, 0, 0, 0};
        int m = 4;

        int[] nums2 = {2, 4, 6, 8};
        int n = 4;

        mergeSortedArrays(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        for (int x : nums1)
            System.out.print(x + " ");
    }
}
