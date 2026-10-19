package ThreeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k;

        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for(i=0;i<n-2;i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            j=i+1; k=n-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    lists.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while (j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while (j<k && nums[k]==nums[k-1]){
                        k--;
                    }

                    j++;
                    k--;
                }
            }
        }
        return lists;
    }
    public static void main(String arg[]){
        ThreeSum15 threeSum15 = new ThreeSum15();

        int nums[]={-1,0,1,2,-1,-4};

        System.out.println("The result is: ");
        System.out.println(threeSum15.threeSum(nums));

    }
}
