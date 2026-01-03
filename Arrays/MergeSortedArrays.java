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
