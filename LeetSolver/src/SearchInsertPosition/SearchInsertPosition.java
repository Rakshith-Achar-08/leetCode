package SearchInsertPosition;

import java.util.Scanner;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int left, right, mid;
        left=0;
        right=nums.length-1;

        while(left<right){
            mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
//        1,3,5,6]
        int num[]={1,3,5,6};

        Scanner scanner = new Scanner(System.in);
        System.out.println("The array is: ");
        for(int i=0;i<num.length;i++)
            System.out.print(" "+num[i]);

        System.out.println("Enter the target");
        int target=scanner.nextInt();

        int res = searchInsertPosition.searchInsert(num, target);
        System.out.println("The result is "+res);
    }
}
