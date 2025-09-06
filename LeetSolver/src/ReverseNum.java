import java.util.*;

class reversingMethod{
    public int reverse(int x){
        int original;
        long reversed=0;
//        this doesn't required to put, if you need. this step only used to delete an extra 0;
//        if(x%10==0){
//            x=x/10;
//        }
        while(x!=0){
            original=x;
            original = original%10;
            reversed = reversed*10 + original;

            //checking the overflow and underflow...
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int)reversed;
    }
}

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        reversingMethod rev = new reversingMethod();
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int res = rev.reverse(num);
        System.out.println("The revesed number is: "+res);
    }
}
