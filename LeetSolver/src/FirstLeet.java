import java.util.*;
public class FirstLeet {
    public void twoSum(int arr[], int target){
        int n = arr.length;
        int i,j;
        ArrayList<Integer> index = new ArrayList<>();
        //int temp[] = new int[2];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    index.add(arr[i]);
                    index.add(arr[j]);
                    System.out.println("Index of the elements are: " + (i+1) + " and " + (j+1));
                    System.out.println("Elements are : "+index.get(0)+ " and " + index.get(1));
                }
            }
        }
    }
    public static void main(String arg[]){
        FirstLeet fl = new FirstLeet();
        System.out.println("\nEnter the number of elements: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int array[] = new int[num];
        System.out.println("\nEnter the elements: ");
        for(int i=0;i<num;i++){
            array[i]= scan.nextInt();
        }
        System.out.println("\nEnter the target: ");
        int target = scan.nextInt();
        fl.twoSum(array, target);   
    }    
}
