package RemoveElement27;

public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int arr[]= {3,2,2,3,2};
        int val = 3;
        RemoveElement27 removeElement27 = new RemoveElement27();
        int res = removeElement27.removeElement(arr, val);
        System.out.println("The result is: "+res);
    }
}
