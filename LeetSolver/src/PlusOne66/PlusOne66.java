package PlusOne66;

public class PlusOne66 {

    public int[] plusOne(int[] digits) {

//        in this problem, we just need to increment the last digits only if the digit is <9.
//        if it is equals to 9, then we need to change that number to 0.
//        suppose, we have the array of elements {1,3,9}
//        According the code:
//          • Iteration starts from last. Which is 9. If statement becomes false.
//          • the 9 will become 0. --> which will make array 1, 3, 0 (without iterating 2nd time)
//          • But we need to make 2nd element 3 as 4. How does it work ?.
//              By iterating 2nd element. If statement becomes true and 3 will become 4 --> which will make array 1,4,0 (right answer).
//
//          • Array having 9 should become 1,0
//          • So, we create an new array of length n+1.
//          • Now, we insert 1 to 0th position of new array.
//          • Same goes to 9,9. The two 9 become 0. And new array will insert 1 to 0th element.
//         • {1,9,9} : the 9, 9 will become 0. On 3rd iteration, if statement becomes true, which is <9, and will increment to 2.

        int n = digits.length;
//        iterates from the last digit.
        for(int i = n-1; i>-1;i--){
//          checking if the number is <9
            if(digits[i]<9){
                digits[i]++; //increments by 1.
                return digits; //returns the array and exits the methond
            }

//          'if' statement becomes false, by default, 9 becomes 0. and exits the loop to insert 1 at newArr[0].
            digits[i]=0;
        }

//      initial the newArr, increase the array size by 1.
        int newArr[] = new int[n+1];

//      inserts the 1 to becomes are 0th position
        newArr[0]=1;

        return newArr;
    }

    static void main() {

        PlusOne66 plusOne66 = new PlusOne66();
        int digits[]={9,9,9};
        int[] result = plusOne66.plusOne(digits);

        System.out.println("The result is: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

}
