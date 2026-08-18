package RemoveDuplicateFromSortedArray;

import java.sql.SQLOutput;

public class RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] nums){
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }


    public static void main(String[] args) {
        //1,1,2,2,3,3, --> 1,2,3,_,_,_
        int arr[]={1,1,2,2,3,3};
        RemoveDuplicateFromSortedArray rem = new RemoveDuplicateFromSortedArray();
        System.out.println(rem.removeDuplicates(arr));
    }
}
