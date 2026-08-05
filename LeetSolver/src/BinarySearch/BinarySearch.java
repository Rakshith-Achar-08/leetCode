package BinarySearch;

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }
}

public class BinarySearch {
    static void main(){
        int[] array = {12,23,34,45,56,67,78,89,90};
        int target = 78;
        Solution solution = new Solution();
        System.out.println("The target position is "+solution.search(array, target));

    }
}
